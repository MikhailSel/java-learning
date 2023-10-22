package ru.seliverstov.library.model;

import java.util.Random;

public class User {
    private Long id;
    private String fullName;

    public User(String fullName) {
        this.id = new Random().nextLong();
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                "}\n";
    }
}
