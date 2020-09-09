//package gerzen777gmail.com.library.service;
//
//import gerzen777gmail.com.library.model.Book;
//import gerzen777gmail.com.library.repository.AuthorRepository;
//import gerzen777gmail.com.library.repository.BookRepository;
//import gerzen777gmail.com.library.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@SpringBootTest
//@Transactional
//class AllUsersByAuthorTest {
//
////    @Autowired
////    AllBooksByAuthorService allBooksByAuthorService;
//
//    @Autowired
//    BookRepository bookRepository;
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    AuthorRepository authorRepository;
//
//    @Test
//    void allUsersByAuthor() {
//
//        List<Book> books = bookRepository.getAllByAuthor_Id(3L);
//
//          Выдаёт ошибку об уникальности ключа
//
//        System.out.println(userRepository.getUsersByBooksIn(books));
//
//    }
//}