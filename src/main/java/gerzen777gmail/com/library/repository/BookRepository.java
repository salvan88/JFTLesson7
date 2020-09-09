package gerzen777gmail.com.library.repository;

import gerzen777gmail.com.library.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> getBookByUserIdOrderByName(Long id);

    List<Book> getBookByAuthor_IdOrderByName(Long id);

    List<Book> getBooksById(Long id);

    List<Book> getAllByAuthor_Id(Long id);

}
