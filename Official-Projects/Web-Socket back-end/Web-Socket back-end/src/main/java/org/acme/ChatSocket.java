package org.acme;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.acme.SocketHandler;

import java.io.IOException;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;

@ServerEndpoint("/demo/")         
@ApplicationScoped
public class ChatSocket {

    Map<String, Session> sessions = new ConcurrentHashMap<>(); 
    SocketHandler socketHandler = new SocketHandler();

    @OnOpen
    public void onOpen(Session session) {
        sessions.put(session.getId(), session);
    }

    @OnClose
    public void onClose(Session session) {
        sessions.remove(session.getId());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        sessions.remove(session.getId());
    }

    @OnMessage
    public void onMessage(Session session, String message) throws IOException {
        System.out.println("Session ID: " + session.getId() + " message: " + message);
        String asteroidData = socketHandler.getAsteroidData(message);
        System.out.println(asteroidData);
        socketHandler.sendMessageToClient(session, asteroidData);
    }

}