package org.acme;

import org.acme.APICaller;

import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;

import java.io.IOException;

public class SocketHandler{

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

    public String getAsteroidData(String data) throws IOException{
        APICaller apiCaller = new APICaller("https://ssd-api.jpl.nasa.gov/nhats.api?des=" + data.toUpperCase());
        return apiCaller.doGetRequest();
    }
}