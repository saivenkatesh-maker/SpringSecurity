package com.chatApplication.ChatApplication.controller;

import com.chatApplication.ChatApplication.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {


    // @MessageMapping("/message") people will send message to this url.
   // @SendTo("/topic/return-to")  people who are subscribed will get these messages.


    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        try{
            //processing message (either saving in Db anything can be done here)
           Thread.sleep(20);
        }catch(Exception e){
            e.printStackTrace();
        }
        return message;
    }
}
