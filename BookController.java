package com.example.demo404;

import java.util.List;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

	
	@Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    

    @DeleteMapping("/{isbn}")
    public String deleteBook(@PathVariable("isbn") String isbn) {
        return bookService.deleteBook(isbn);
    }
    
    @GetMapping("/{isbn}")
    public Book getBookByISBN(@PathVariable("isbn") String isbn) {
        return ( bookService).getBookByISBN(isbn);
    }
    
    @PutMapping("/{isbn}")
    public Book updateBook(@PathVariable("isbn") String isbn, @RequestBody Book book) {
        book.setIsbn(isbn);
        return bookService.updateBook(book);
    }
    
}

