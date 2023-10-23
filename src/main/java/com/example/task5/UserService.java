package com.example.task5;

import com.example.task5.EmailService;

public class UserService {
    private final com.example.task5.EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
// Логика регистрации пользователя
// ...

// Отправка приветственного письма
        emailService.sendEmail(email, "Добро пожаловать!", "Добро пожаловать в наше приложение!");
    }
}
