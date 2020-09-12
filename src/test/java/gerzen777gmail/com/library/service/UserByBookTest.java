package gerzen777gmail.com.library.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
class UserByBookTest {

    @Autowired
    UserByBookService userByBookService;

    @Test
    @Sql({"/script.sql"})
    void userByBookTest() {

        Assertions.assertEquals("Яна", userByBookService.UserByBook(1L).getName());
    }
}