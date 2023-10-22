package ru.seliverstov.library.repository;

import ru.seliverstov.library.model.Book;
import ru.seliverstov.library.model.BookIssue;
import ru.seliverstov.library.model.User;

import java.util.ArrayList;
import java.util.List;

public class BookIssueRepository {
    private final List<BookIssue> bookIssuesList = new ArrayList<>();

    public BookIssue add(BookIssue bookIssue) {
        bookIssuesList.add(bookIssue);
        return bookIssue;
    }

    public List<BookIssue> getBookIssuesList() {
        return bookIssuesList;
    }

    public BookIssue findById(long id) {
        for (int i = 0; i < bookIssuesList.size(); i++) {
            BookIssue bookIssue = bookIssuesList.get(i);
            if (bookIssue.getId() == id) {
                return bookIssue;
            }
        }
        return null;
    }

    public List<BookIssue> findByUserId(long userId) {
        List<BookIssue> result = new ArrayList<>();
        for (int i = 0; i < bookIssuesList.size(); i++) {
            BookIssue bookIssue = bookIssuesList.get(i);
            if (bookIssue.getUserId() == userId) {
                result.add(bookIssue);
            }
        }
        return result;
    }

}
