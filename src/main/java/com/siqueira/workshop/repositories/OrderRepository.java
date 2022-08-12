package com.siqueira.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siqueira.workshop.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{
}