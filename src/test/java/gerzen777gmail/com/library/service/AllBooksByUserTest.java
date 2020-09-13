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
class AllBooksByUserTest {

    @Autowired
    AllBooksByUserService allBooksByUserService;

    @Test
    @Sql({"/script.sql"})
    void allBooksByUserTest() {

        List<Book> books = allBooksByUserService.allBooksByUser(1L);

        Assertions.assertEquals(2, books.size());
    }
}