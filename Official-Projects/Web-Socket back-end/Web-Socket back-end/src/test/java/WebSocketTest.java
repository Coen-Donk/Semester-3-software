import org.acme.SocketHandler;
import org.acme.WebSocket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import javax.websocket.Session;


import java.io.IOException;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WebSocketTest {

    @Mock
    Session session;

    @Test
    void testOnOpen(){
        String sessionId = "012";
        when(session.getId()).thenReturn(sessionId);

        WebSocket webSocket = new WebSocket();

        webSocket.onOpen(session);

        Assertions.assertTrue(webSocket.sessions.containsKey(sessionId));
    }

    @Test
    void testOnClose(){
        String sessionId = "012";

        when(session.getId()).thenReturn(sessionId);

        WebSocket webSocket = new WebSocket();

        webSocket.onOpen(session);
        webSocket.onClose(session);

        Assertions.assertFalse(webSocket.sessions.containsKey(sessionId));
    }

    @Test
    void testOnError(){
        String sessionId = "012";

        when(session.getId()).thenReturn(sessionId);

        WebSocket webSocket = new WebSocket();

        webSocket.onOpen(session);
        webSocket.onError(session, new Exception());

        Assertions.assertFalse(webSocket.sessions.containsKey(sessionId));
    }

    @Test
    void testOnMessage() throws IOException {
        // Arrange
        String message = "{\"data\":\"2021 JG6\"}";
        String asteroidData = "{'name': 'asteroid1', 'distance': 100}";

        when(session.getId()).thenReturn("123");
        SocketHandler socketHandler = mock(SocketHandler.class);
        when(socketHandler.getAsteroidData(message)).thenReturn(asteroidData);

        WebSocket endpoint = new WebSocket();
        endpoint.socketHandler = socketHandler;
        // Act
        endpoint.onMessage(session, message);

        // Assert
        verify(session).getId();
        verify(socketHandler).getAsteroidData(message);
        verify(socketHandler).sendMessageToClient(session, asteroidData);
    }

}
