package gerzen777gmail.com.library.service;

import gerzen777gmail.com.library.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
//@Sql({"/script.sql"})
class AllBooksByAuthorTest {

    @Autowired
    AllBooksByAuthorService allBooksByAuthorService;

    @Test
    void allBooksByAuthorTest() {

        List<Book> books = allBooksByAuthorService.allBooksByAuthor(2L);

        Assertions.assertEquals(2, books.size());
    }
}