package com.progmatic.springwebsocketexample.app.controllers;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/topic/{id}")
    @SendTo("/topic/{id}")
    public String handleMessage(@DestinationVariable String id, String message) {
        // Process message here
        return message;
    }

}