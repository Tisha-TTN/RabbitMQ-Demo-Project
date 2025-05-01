package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.json.Order;

import org.springframework.web.bind.annotation.*;


@RestController
public class MessageController {
    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/send")

    public String send(@RequestParam String msg){
        messageProducer.sendMessage(msg);
        return "Message sent";
    }

    @PostMapping("/sendOrder")
    public String sendOrder(@RequestBody Order order){
        messageProducer.sendOrder(order);
        return "Order send :"+order;
    }
}
