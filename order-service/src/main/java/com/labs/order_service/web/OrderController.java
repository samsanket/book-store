//package com.labs.order_service.web;
//
//import com.labs.order_service.domain.SecurityConfig;
//import com.labs.order_service.domain.model.CreateOrderRequest;
//import com.labs.order_service.domain.model.CreateOrderResponse;
//import jakarta.validation.Valid;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//
//
//
//    private static  final Logger log= LoggerFactory.getLogger(OrderController.class);
//    private final  OrderService orderService;
//
//    private final SecurityConfig securityService;
//
//
//    public OrderController(OrderService orderService, SecurityConfig securityService) {
//        this.orderService = orderService;
//        this.securityService = securityService;
//    }
//
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    CreateOrderResponse createOrder(@Valid @RequestBody CreateOrderRequest createOrderRequest){
//        String userName = securityService.getLoginUserName();
//        log.info("Creating the order for the user {}",userName);
//        return orderService.createOrder(userName,createOrderRequest);
//
//    }
//}
