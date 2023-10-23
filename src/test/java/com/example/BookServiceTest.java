package com.example;

import com.example.task4.EmailService;
import com.example.task5.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    // Создаем заглушку типа Mock для интерфейса BookRepository
    @Mock
    private InMemoryBookRepository mockInMemoryBookRepository;

    // Внедряем заглушку в конструктор класса BookService
    @InjectMocks
    private BookService bookService;

    /**
     * Тестируем поведение метода findBookById класса BookService
     */

    @Test
    public void findBookByIdShouldReturnBook() {
// Вызываем метод, который мы хотим протестировать
        bookService.findBookById("1");

// Проверяем, что метод findById() был вызван с ожидаемыми аргументами
        verify(mockInMemoryBookRepository).findById("1");
    }

    /**
     * Проверяем метод findAllBooks класса BookService
     */
    @Test
    public void findAllBooksShouldReturnListBooks() {
        // Вызываем метод, который мы хотим протестировать

        bookService.findAllBooks();

        // Проверяем, что метод findAll() был вызван с ожидаемыми аргументами
        verify(mockInMemoryBookRepository).findAll();

    }

}
