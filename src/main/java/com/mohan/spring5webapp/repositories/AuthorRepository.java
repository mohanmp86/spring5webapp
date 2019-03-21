package com.mohan.spring5webapp.repositories;

import com.mohan.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
