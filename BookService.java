package com.example.demo404;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {

     Map<String, Book> books = new HashMap<>();

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    

    public Book addBook(Book book) {
        books.put(book.getIsbn(), book);
        return book;
    }

    public Book updateBook(Book book) {
        books.put(book.getIsbn(), book);
        return book;
    }

    public String deleteBook(String isbn) {
        if (books.get(isbn) == null) {
            return "Error... Null";
        }

        books.remove(isbn);
        return "Removed";
    }

    public Book getBookByISBN(String isbn) {
        return books.get(isbn);
    }

}

