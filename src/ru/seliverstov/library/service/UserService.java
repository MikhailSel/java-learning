package ru.seliverstov.library.service;

import ru.seliverstov.library.model.User;
import ru.seliverstov.library.repository.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User add(final User user) {
        User result = userRepository.findByFullName(user.getFullName());
        if (result == null) {
            return userRepository.add(user);
        }
        throw new RuntimeException("Пользователь уже зарегистрирован в библиотеке");

    }

    public boolean removeById(final long userId) {
        boolean removeResult = userRepository.removeById(userId);
        if (removeResult) {
            return true;
        }
        System.out.println("Пользователь не может быть удален, так как она не зарегистрирован");
        return false;
    }

    public List<User> getUserList() {
        return userRepository.getUserList();
    }

}
