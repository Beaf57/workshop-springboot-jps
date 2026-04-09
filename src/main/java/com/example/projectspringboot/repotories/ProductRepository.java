package com.example.projectspringboot.repotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
