package com.example.launchcontrol.managers;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class WebSocketManager {

    private Socket socket;
    private static WebSocketManager webSocketManager;
    private String domainName = "http://chat.socket.io"; //TODO: this is a placeholder

    public static Socket getWebSocket()
    {
        if (webSocketManager == null)
            webSocketManager = new WebSocketManager();

        return webSocketManager.socket;
    }

    private WebSocketManager()
    {
        try
        {
            socket = IO.socket(domainName);
        } catch (URISyntaxException e) {}
    }

}
