package com.example.demo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message){
        rabbitTemplate.convertAndSend(RabbitMQ.EXCHANGE, RabbitMQ.ROUTING_KEY, message);
        System.out.println("Message sent :"+message);
    }
}
