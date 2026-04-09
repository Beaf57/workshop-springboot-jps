package com.example.projectspringboot.repotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
