package gerzen777gmail.com.library.repository;

import gerzen777gmail.com.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author getById(Long id);

}
