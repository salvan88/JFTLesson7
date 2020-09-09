package gerzen777gmail.com.library.controller;

import gerzen777gmail.com.library.service.AllBooksByUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    private final AllBooksByUserService bookService;

    public BookController(AllBooksByUserService bookService, AllBooksByUserService bookService1) {
        this.bookService = bookService1;
    }

    @PostMapping("/library")
    public LibraryResponse bookResult(@RequestBody LibraryRequest libraryRequest) {
        LibraryResponse libraryResponse = new LibraryResponse();
        libraryResponse.setResult(bookService.allBooksByUser(Long.valueOf(libraryRequest.getMessageRequest())));

        return libraryResponse;
    }
}