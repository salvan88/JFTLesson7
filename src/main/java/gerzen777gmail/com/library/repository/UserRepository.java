package gerzen777gmail.com.library.repository;

import gerzen777gmail.com.library.model.Book;
import gerzen777gmail.com.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByBooksIn(List<Book> id);

    User getUsersByBooksIn(List<Book> id);

}
