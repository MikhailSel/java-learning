package ru.seliverstov.library.repository;

import ru.seliverstov.library.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final List<User> userList = new ArrayList<>();

    public User add(User user) {
        userList.add(user);
        return user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public User findById(long id) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User findByFullName(String fullName) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getFullName().equals(fullName)) {
                return user;
            }
        }
        return null;
    }

    public boolean removeById(long userId) {
        return userList.removeIf((user) -> user.getId() == userId);
    }
}



