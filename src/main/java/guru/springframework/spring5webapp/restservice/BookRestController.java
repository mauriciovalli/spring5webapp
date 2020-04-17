package guru.springframework.spring5webapp.restservice;

import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    private final BookRepository bookRepository;

    public BookRestController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/rest/books")
    public Iterable<Book> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return bookRepository.findAll();
    }
}
