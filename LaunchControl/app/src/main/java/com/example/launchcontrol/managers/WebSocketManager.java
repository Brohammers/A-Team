/**
 * Creation Date: Friday, February 1st 2019
 * Original Author: Rohan Rao
 * Contents of File: Used for interfacing with the web server
 */
package com.example.launchcontrol.managers;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class WebSocketManager {

    private Socket socket;
    private static WebSocketManager webSocketManager;
    private String domainName = "https://afternoon-mountain-12604.herokuapp.com/";

    public static Socket getWebSocket()
    {
        if (webSocketManager == null)
            webSocketManager = new WebSocketManager();

        return webSocketManager.socket;
    }

    //TODO: Add authentication here?
    private WebSocketManager()
    {
        try
        {
            socket = IO.socket(domainName);
            socket.connect();
        } catch (URISyntaxException e) {}
    }

}
