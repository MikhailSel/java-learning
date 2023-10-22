package ru.seliverstov.library.repository;

import ru.seliverstov.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<Book> bookList = new ArrayList<>();

    public Book add(Book book) {
        bookList.add(book);
        return book;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Book findById(long id) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Book findByName(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public boolean removeById(long bookId) {
        return bookList.removeIf((book) -> book.getId() == bookId);
    }

}
