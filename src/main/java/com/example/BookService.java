package com.example;

import java.util.List;
import java.util.Map;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    public Book findBookById(String id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {

        return bookRepository.findAll();
    }
}