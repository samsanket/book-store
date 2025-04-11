package com.labs.order_service.service;

import com.labs.order_service.controller.MyPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabitMQListner {

    private static final Logger log = LoggerFactory.getLogger(RabitMQListner.class);

    @RabbitListener(queues = "${orders.new-orders-queue}")
    public void handleOverChange(MyPayload myMessage){
        log.info("$$$$$$$$$$$$$$$$$$$$$$$$$");
        log.info("Handling new orders queue with data =  {} ", myMessage);
    }

    @RabbitListener(queues = "${orders.delivered-orders-queue}")
    public void handDilaverOrders(MyPayload myPayload){
        log.info("$$$$$$$$$$$$$$$$$$$$$$$$$");
        log.info("Handling Delivered orders queue with data =  {} ", myPayload);

    }
}