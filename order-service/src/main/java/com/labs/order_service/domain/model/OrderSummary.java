package com.labs.order_service.domain.model;

public record OrderSummary(String orderNumber, OrderStatus status) {}