package com.labs.order_service.controller;


import com.labs.order_service.ApplicationProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RabitMQDemoController {

    private final RabbitTemplate rabbitTemplate;
    private final ApplicationProperties applicationProperties;


    public RabitMQDemoController(RabbitTemplate rabbitTemplate, ApplicationProperties applicationProperties) {
        this.rabbitTemplate = rabbitTemplate;
        this.applicationProperties = applicationProperties;
    }


    @PostMapping("/send")
    public  void sendMessage(@RequestBody MyMessage myMessage ){
        rabbitTemplate.convertAndSend(applicationProperties.orderEventsExchange()
        ,myMessage.routingKey(),
                myMessage.payload());
    }
}

