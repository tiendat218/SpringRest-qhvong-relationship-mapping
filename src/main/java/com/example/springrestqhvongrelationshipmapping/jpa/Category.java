package com.example.springrestqhvongrelationshipmapping.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<Book> books;



}
