package com.example.bookmanager;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends ReactiveCrudRepository<Books, Long> {

}
