package com.labs.order_service.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    @Query(
            """
        select new com.sivalabs.bookstore.orders.domain.models.OrderSummary(o.orderNumber, o.status)
        from OrderEntity o
        where o.userName = :userName
        """)
    List<OrderSummary> findByUserName(String userName);

    @Query(
            """
        select distinct o
        from OrderEntity o left join fetch o.items
        where o.userName = :userName and o.orderNumber = :orderNumber
        """)
    Optional<OrderEntity> findByUserNameAndOrderNumber(String userName, String orderNumber);
}
