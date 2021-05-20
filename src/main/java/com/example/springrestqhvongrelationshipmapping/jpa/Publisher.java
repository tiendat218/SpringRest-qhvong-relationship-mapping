package com.example.springrestqhvongrelationshipmapping.jpa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = "bookPublisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "publisher",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnoreProperties("publisher")
    private Set<BookPublisher> bookPublisherSecondaryTable = new HashSet<>();
}
