package gerzen777gmail.com.library.service;

import gerzen777gmail.com.library.model.User;
import gerzen777gmail.com.library.repository.BookRepository;
import gerzen777gmail.com.library.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserByBookService {

    BookRepository bookRepository;
    UserRepository userRepository;

    public UserByBookService(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public User UserByBook(Long id) {

        return userRepository.getUserByBooksIn(bookRepository.getBooksById(id));
    }
}
