package com.example.springrestqhvongrelationshipmapping.jpa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"category","authors","bookPublisher"})
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "categoryy_id")
    @JsonIgnoreProperties("books")
    private Category category;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author", joinColumns =
        @JoinColumn(name = "book_id", referencedColumnName = "id")
            ,inverseJoinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id")
    )
    @JsonIgnoreProperties("books")
    private Set<Author> authors;

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnoreProperties("books")
    private Set<BookPublisher> bookPublishers = new HashSet<>();


}
