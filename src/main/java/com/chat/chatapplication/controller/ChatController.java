package com.chat.chatapplication.controller;

import com.chat.chatapplication.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        // In a real application, you would save the message to a database here
        return message; // Echo the message back to the sender
    }
    @GetMapping("/chat")
    public String chat() {
        return "chat"; // Return the name of the HTML template for the chat page
    }
}
