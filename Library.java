package com.example.demo404;

import java.util.HashMap;
import java.util.Map;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class Library {

     List<Book> books = new ArrayList<Book>();
     List<Librarian> librarians = new ArrayList<Librarian>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public void removeLibrarian(Librarian librarian) {
        librarians.remove(librarian);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public Book searchBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

}


