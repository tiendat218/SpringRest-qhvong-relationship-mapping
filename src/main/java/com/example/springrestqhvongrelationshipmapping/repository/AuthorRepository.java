package com.example.springrestqhvongrelationshipmapping.repository;

import com.example.springrestqhvongrelationshipmapping.jpa.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
