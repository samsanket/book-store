package com.labs.order_service.domain;

import com.labs.order_service.domain.model.CreateOrderRequest;
import com.labs.order_service.domain.model.CreateOrderResponse;
import com.labs.order_service.domain.model.OrderDTO;
import com.labs.order_service.domain.model.OrderStatus;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class OrderService {


 private  static  final Logger log = LoggerFactory.getLogger(OrderService.class);

 private final OrderRepository orderRepository;

 OrderService(OrderRepository orderRepository){
     this.orderRepository=orderRepository;
 }


    public CreateOrderResponse createOrder(String userName, @Valid CreateOrderRequest request) {

     OrderEntity order = OrderMapper.convertToEntity(request);
     order.setUserName(userName);
        OrderEntity save = this.orderRepository.save(order);
        log.info("Orer created with order number : {} ", save.getOrderNumber());
        return new CreateOrderResponse(order.getOrderNumber());
    }

    public List<OrderSummary> findOrders(String userName) {
        return orderRepository.findByUserName(userName);
    }

    public Optional<OrderDTO> findUserOrder(String userName, String orderNumber) {
        return orderRepository
                .findByUserNameAndOrderNumber(userName, orderNumber)
                .map(OrderMapper::convertToDTO);
    }

//    public void processNewOrders() {
//        List<OrderEntity> orders = orderRepository.findByStatus(OrderStatus.NEW);
//        log.info("Found {} new orders to process", orders.size());
//        for (OrderEntity order : orders) {
//            this.process(order);
//        }
//    }

}
