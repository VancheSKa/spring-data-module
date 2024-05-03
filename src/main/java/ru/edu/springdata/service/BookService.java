package ru.edu.springdata.service;

import ru.edu.springdata.model.Book;

import java.util.List;

public interface BookService {
    Book getBookById(long id);

    List<Book> getAllBooks();

    List<Book> getBooksByLanguage(String language);

    List<Book> getBooksByCategory(String category);

    List<Book> getBooksByLanguageAndCategory(String language, String category);

    Book save(Book book);

    void update(Book book);

    void delete(Long id);

    long getRecordCount();
}
