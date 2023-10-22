package ru.seliverstov.library.service;

import ru.seliverstov.library.model.Book;
import ru.seliverstov.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(final BookRepository bookRepository1) {
        this.bookRepository = bookRepository1;
    }

    public Book add(final Book book) {
        Book result = bookRepository.findByName(book.getName());
        if (result == null) {
            return bookRepository.add(book);
        }

        throw new RuntimeException("Книга уже зарегистрирована в библиотеке");
    }

    public boolean removeById(final long bookId) {
        boolean removeResult = bookRepository.removeById(bookId);
        if (removeResult) {
            return true;
        }
        System.out.println("Книга не может быть удалена, так как она не зарегистрирована");
        return false;
    }

    public List<Book> getBookList() {
        return bookRepository.getBookList();
    }

}
