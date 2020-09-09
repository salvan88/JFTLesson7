package gerzen777gmail.com.library.service;

import gerzen777gmail.com.library.model.Book;
import gerzen777gmail.com.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AllBooksByUserService {

    BookRepository bookRepository;

    public AllBooksByUserService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public List<Book> allBooksByUser(Long id) {
        return bookRepository.getBookByUserIdOrderByName(id);
    }
}
