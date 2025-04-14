package com.labs.order_service.domain;

import com.labs.order_service.domain.model.OrderStatus;

public record OrderSummary(String orderNumber, OrderStatus status) {}