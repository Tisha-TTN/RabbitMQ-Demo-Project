package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = RabbitMQ.QUEUE)
    public void receiveMessage(String message){
        System.out.println("Received message :"+message);
    }

}
