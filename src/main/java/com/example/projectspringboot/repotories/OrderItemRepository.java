package com.example.projectspringboot.repotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectspringboot.entities.OrderItem;
import com.example.projectspringboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
