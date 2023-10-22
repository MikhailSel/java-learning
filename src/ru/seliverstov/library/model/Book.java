package ru.seliverstov.library.model;

import java.util.Random;

public class Book {
    private Long id;
    private String name;
    private String author;

    public Book(String name, String author) {
        this.id = new Random().nextLong();
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            '}';
    }
}



