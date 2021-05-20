package com.example.springrestqhvongrelationshipmapping.repository;

import com.example.springrestqhvongrelationshipmapping.jpa.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
