package gerzen777gmail.com.library.service;

import gerzen777gmail.com.library.model.Book;
import gerzen777gmail.com.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AllBooksByAuthorService {

    BookRepository bookRepository;

    public AllBooksByAuthorService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public List<Book> allBooksByAuthor(Long id) {
        return bookRepository.getBookByAuthor_IdOrderByName(id);
    }

}