package com.example;

import com.example.task6.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class TestMockService {

    @Test
    public void checkGetUserInUserService() {
        // Создание мок-объекта для зависимости
        UserService userServiceMock = mock(UserService.class);

        // Установка ожиданий: метод getUser должен быть вызван с аргументом "john"
        when(userServiceMock.getUser("john")).thenReturn(new User("john"));
        // Тестируем код

    }

    @Test
    public void checkGetUserInUserManager() {
        UserService userServiceMock = mock(UserService.class);
        UserManager userManager = new UserManager(userServiceMock);

        User user = userManager.findUser("john");
// Проверка, что ожидания выполнились
        verify(userServiceMock).getUser("john");
    }
    //Изоляция от внешних ресурсов: Если ваш код взаимодействует с внешними ресурсами, такими как базы данных
    // или веб-сервисы, моки могут использоваться для изоляции тестов от этих ресурсов. Вы можете имитировать
    // ответы от внешних систем, чтобы убедиться, что ваш код обрабатывает их правильно.
    // Создание мок-объекта для базы данных
    DatabaseConnection dbConnectionMock = mock(DatabaseConnection.class);

    // Установка ожиданий: метод executeQuery должен вернуть фиктивный результат


//    when(dbConnectionMock.executeQuery("SELECT * FROM users")).thenReturn(fakeUserData);
//
//    // Тестируем код, который использует базу данных
//    UserRepository userRepository = new UserRepository(dbConnectionMock);
//    List<User> users = userRepository.getAllUsers();
//
//    // Проверка, что код работает с данными из мока
//    assertEquals(3, users.size());
//
//    //Тестирование исключительных ситуаций: Моки могут быть использованы для создания ситуаций, которые сложно
//    // воссоздать в реальном коде. Например, вы можете создать мок, который выбрасывает исключение при определенных
//    // условиях, чтобы убедиться, что ваш код обрабатывает исключения правильно.
//
//    // Создание мок-объекта для зависимости, который выбрасывает исключение
//    PaymentGateway paymentGatewayMock = mock(PaymentGateway.class);
//    when(paymentGatewayMock.processPayment(any())).thenThrow(new PaymentFailedException("Payment failed"));
//
//    // Тестируем код, который обрабатывает платежи
//    PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGatewayMock);
//    Throwable exception = assertThrows(PaymentFailedException.class, () -> paymentProcessor.makePayment(order));
//
//// Проверка, что исключение было выброшено и обработано
//    assertEquals("Payment failed", exception.getMessage());
}
