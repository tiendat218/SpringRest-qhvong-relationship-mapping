package com.example.springrestqhvongrelationshipmapping.repository;

import com.example.springrestqhvongrelationshipmapping.jpa.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository<BookPublisher,Integer> {
}
