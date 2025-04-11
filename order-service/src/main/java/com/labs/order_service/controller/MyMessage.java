package com.labs.order_service.controller;

public record  MyMessage(String routingKey, MyPayload payload){}
