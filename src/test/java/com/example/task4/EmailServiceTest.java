package com.example.task4;

import com.example.task5.UserService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Spy Вариант2
 */

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Spy Вариант1
 */

public class EmailServiceTest {
    @Test
    void testSendWelcomeEmail() {
// Создаем шпиона для сервиса отправки email
        EmailService emailService = spy(new EmailService());

// Вызываем метод регистрации пользователя
        UserService userService = new UserService((com.example.task5.EmailService) emailService);
        userService.registerUser("user@example.com");

// Проверяем, что метод sendEmail был вызван с определенными аргументами
        verify(emailService).sendEmail("user@example.com", "Добро пожаловать!", "Добро пожаловать в наше приложение!");
    }
}
