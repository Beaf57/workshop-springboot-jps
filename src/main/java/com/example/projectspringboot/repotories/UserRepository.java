package com.example.projectspringboot.repotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
