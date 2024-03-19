package io.github.oengajohn.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.oengajohn.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
    
}
