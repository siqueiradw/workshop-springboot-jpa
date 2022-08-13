package com.siqueira.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siqueira.workshop.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
}