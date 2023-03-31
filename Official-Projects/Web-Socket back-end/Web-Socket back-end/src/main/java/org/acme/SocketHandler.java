package org.acme;


import org.acme.messages.AsteroidDataMessage;
import org.acme.messages.AsteroidRequestMessage;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.websocket.Session;

import java.io.IOException;

public class SocketHandler{

    private String apiUrl = "https://ssd-api.jpl.nasa.gov/nhats.api?des=";

    ObjectMapper objectMapper = new ObjectMapper();

    public SocketHandler(){
       //Empty as it's required to build the class
    }
    
    public void sendMessageToClient(Session session, String message) {
        session.getAsyncRemote().sendObject(message, result ->  {
            if (result.getException() != null) {
                System.out.println("Unable to send message: " + result.getException());
            }
        });
    }

    private AsteroidRequestMessage mapRequestMessageToObject(String data)throws JsonProcessingException{
        return objectMapper.readValue(data, AsteroidRequestMessage.class);
    }

    private AsteroidDataMessage mapNasaDataToAsteroidObject(String asteroidData) throws IOException {
        return objectMapper.readValue(asteroidData, AsteroidDataMessage.class);
    }

    private String receiveAsteroidDataJson(AsteroidDataMessage adm) throws JsonProcessingException {
        return objectMapper.writeValueAsString(adm);
    }

    public String getAsteroidData(String data) throws IOException{
        AsteroidRequestMessage asm = mapRequestMessageToObject(data);
        APICaller apiCaller = new APICaller(apiUrl + asm.getData().toUpperCase());
        String asteroidDataString =  apiCaller.doGetRequest();
        AsteroidDataMessage adm = mapNasaDataToAsteroidObject(asteroidDataString);
        return receiveAsteroidDataJson(adm);
    }
}