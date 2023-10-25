package com.example.task6;

import com.example.task5.EmailService;

public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public User getUser(String name) {
        return user;
    }
}



