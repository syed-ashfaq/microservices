package com.capgemini.microserives.order.respository;


import com.capgemini.microserives.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
