package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import com.example.demo.json.Order;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = RabbitMQ.QUEUE)
    public void receiveMessage(String message){
        System.out.println("Received message :"+message);
    }


    @RabbitListener(queues = RabbitMQ.ORDER_QUEUE)
    public void receiveOrder(Order order){
        System.out.println("Received Order :"+order);
    }
}
