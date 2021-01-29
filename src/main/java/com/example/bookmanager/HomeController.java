package com.example.bookmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/books")
public class HomeController {

    @Autowired BookRepository bookRepository;

    @GetMapping("")
    public Flux<Books> getHome() {

        return bookRepository.findAll();

    }

    @PostMapping("")
    public Mono<Books> postBook(@RequestBody Books books) {

        return bookRepository.save(books);
    }

    @PutMapping("")
    public Mono<Books> updateBook(@RequestBody Books books) {

        return bookRepository.save(books);

    }

    @DeleteMapping("")
    public boolean deleteBook(@RequestBody Books books) {

        try {
            bookRepository.deleteById(books.getId()).block(); // Note this!
            return true;

        } catch (Exception e) {

            return false;
        }
    }
}