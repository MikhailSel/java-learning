package ru.seliverstov.library.service;

import ru.seliverstov.library.model.Book;
import ru.seliverstov.library.model.BookIssue;
import ru.seliverstov.library.model.Penalty;
import ru.seliverstov.library.model.User;
import ru.seliverstov.library.repository.BookIssueRepository;
import ru.seliverstov.library.repository.BookRepository;
import ru.seliverstov.library.repository.UserRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookIssueService {

    public final BookIssueRepository bookIssueRepository;
    public final UserRepository userRepository;
    public final BookRepository bookRepository;

    public BookIssueService(BookIssueRepository bookIssueRepository, UserRepository userRepository, BookRepository bookRepository) {
        this.bookIssueRepository = bookIssueRepository;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }


    public BookIssue add(Long userId, Long bookId) {
        Book bookResult = bookRepository.findById(bookId);
        if (bookResult == null) {
            System.out.println("Книга не зарегистрирована");
            return null;
        }
        User userResult = userRepository.findById(userId);
        if (userResult == null) {
            System.out.println("Пользователь не зарегистрирован");
            return null;
        }
        BookIssue bookIssue = new BookIssue(bookId,userId, LocalDateTime.now(), LocalDateTime.now().plusMonths(1));
        bookIssueRepository.add(bookIssue);
        System.out.println(bookIssue);
        return bookIssue;

    }

    public Penalty returnBookIssue(Long bookIssueId) {
        BookIssue bookIssueResult = bookIssueRepository.findById(bookIssueId);
        bookIssueResult.setIssueFact(LocalDateTime.now());
        if (bookIssueResult.getTo().isBefore(bookIssueResult.getIssueFact())) {
            return new Penalty(bookIssueId, BigDecimal.valueOf(1000),"Не оплачено" );

        }
        return null;
    }
}
