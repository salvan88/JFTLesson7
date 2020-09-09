package gerzen777gmail.com.library.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
class UserByBookTest {

    @Autowired
    UserByBookService userByBookService;

    @Test
    void userByBookTest() {

        System.out.println(userByBookService.UserByBook(4L).getName());
    }
}