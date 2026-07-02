package com.devops.bookstore.controller;

import com.devops.bookstore.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    List<Book> books = new ArrayList<>();

    public BookController() {

        books.add(new Book(1, "Java", "James Gosling", 500));
        books.add(new Book(2, "Spring Boot", "Craig Walls", 650));
        books.add(new Book(3, "Docker", "Nigel Poulton", 700));

    }

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

}