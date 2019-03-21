package com.mohan.spring5webapp.repositories;

import com.mohan.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
