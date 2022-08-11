package com.siqueira.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siqueira.workshop.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
}
