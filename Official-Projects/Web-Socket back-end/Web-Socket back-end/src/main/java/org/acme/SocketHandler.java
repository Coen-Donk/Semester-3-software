package org.acme;

import com.fasterxml.jackson.core.JsonPointer;
import org.acme.APICaller;
import org.acme.messages.AsteroidDataMessage;
import org.acme.messages.AsteroidRequestMessage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;

import java.io.IOException;

public class SocketHandler{

    private String apiUrl = "https://ssd-api.jpl.nasa.gov/nhats.api?des=";

    ObjectMapper objectMapper = new ObjectMapper();

    public SocketHandler(){
        
    }
    
    public void sendMessageToClient(Session session, String message) {
        session.getAsyncRemote().sendObject(message, result ->  {
            if (result.getException() != null) {
                System.out.println("Unable to send message: " + result.getException());
            }
        });
    }

    // public String getResponseCode() throws IOException {
    //     APICaller apiCaller = new APICaller("https://ssd-api.jpl.nasa.gov/nhats.api?des=2021%20JG6");
    //     apiCaller.doGetRequest("hello");
    //     return "";
    // }

    private AsteroidRequestMessage mapMessageToObject(String data) throws JsonMappingException, JsonProcessingException{
        return objectMapper.readValue(data, AsteroidRequestMessage.class);
    }

    private AsteroidDataMessage mapNasaDataToAsteroidObject(String asteroidData) throws JsonMappingException, JsonProcessingException {
        System.out.println(asteroidData);
        return objectMapper.readValue(asteroidData, AsteroidDataMessage.class);
    }

    public String getAsteroidData(String data) throws IOException{
        AsteroidRequestMessage asm = mapMessageToObject(data);
        APICaller apiCaller = new APICaller(apiUrl + asm.getData().toUpperCase());
        String asteroidDataString =  apiCaller.doGetRequest();
        System.out.println(asteroidDataString);
        return mapNasaDataToAsteroidObject(asteroidDataString).getFullname();
    }
}