package com.example.springrestqhvongrelationshipmapping.repository;

import com.example.springrestqhvongrelationshipmapping.jpa.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
