package com.example.demo;

import com.example.demo.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Paulo Henrique
 */
@Controller
public class SocketController {

    @MessageMapping("/newMessage")
    @SendTo("/topic/chat")
    public Message sendMessage(@Payload Message message) {
        return message;
    }

}
