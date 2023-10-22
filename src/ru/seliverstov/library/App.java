package ru.seliverstov.library;

import ru.seliverstov.library.model.Book;
import ru.seliverstov.library.model.BookIssue;
import ru.seliverstov.library.model.Penalty;
import ru.seliverstov.library.model.User;
import ru.seliverstov.library.repository.BookIssueRepository;
import ru.seliverstov.library.repository.BookRepository;
import ru.seliverstov.library.repository.UserRepository;
import ru.seliverstov.library.service.BookIssueService;
import ru.seliverstov.library.service.BookService;
import ru.seliverstov.library.service.UserService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book("Собака", "В.Ю.Акофин");
        Book book2 = new Book("Кошка", "В.Ю.Акофин");
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        BookIssueRepository bookIssueRepository = new BookIssueRepository();
        BookIssueService bookIssueService = new BookIssueService(bookIssueRepository, userRepository, bookRepository);
        User user1 = new User("Селиверстов Михаил Аркадьевич");

        Book addedBook = bookService.add(book1);
        Book addedBook2 = bookService.add(book2);
        //System.out.println("Зарегистрированные книги");
        //List<Book> bookList = bookService.getBookList();
        //System.out.println(bookList);
        User addedUser = userService.add(user1);
        BookIssue result = bookIssueService.add(user1.getId(), book1.getId());
        result.setTo(LocalDateTime.now().minusMonths(0));
        Penalty bookIssueResult = bookIssueService.returnBookIssue(result.getId());
        System.out.println(bookIssueResult);










    }
}
