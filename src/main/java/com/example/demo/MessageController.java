package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MessageController {
    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/send")
    public String send(@RequestParam String msg){
        messageProducer.sendMessage(msg);
        return "Message sent";
    }
}
