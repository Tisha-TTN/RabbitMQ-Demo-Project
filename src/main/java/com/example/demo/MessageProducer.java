package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.json.Order; // ✅ Correct import

import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message){
        rabbitTemplate.convertAndSend(RabbitMQ.EXCHANGE, RabbitMQ.ROUTING_KEY, message);
        System.out.println("Message sent :"+message);
    }
    public void sendOrder(Order order) {
        // Send the order as a JSON message to RabbitMQ
        rabbitTemplate.convertAndSend(RabbitMQ.ORDER_EXCHANGE, RabbitMQ.ORDER_ROUTING_KEY, order);
        System.out.println("Sent order: " + order);
    }
}
