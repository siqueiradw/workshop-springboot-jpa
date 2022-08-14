package com.siqueira.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siqueira.workshop.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{
}