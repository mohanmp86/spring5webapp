package com.mohan.spring5webapp.bootstrap;

import com.mohan.spring5webapp.model.*;
import com.mohan.spring5webapp.repositories.AuthorRepository;
import com.mohan.spring5webapp.repositories.BookRepository;
import com.mohan.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){



        Publisher pub = new Publisher();
        pub.setName("TATA");
        pub.setLineOne("3677");
        pub.setLineTwo("Pintail Terrace");
        pub.setCity("Fremont");
        pub.setState("CA");
        pub.setZipCode(94555);

        publisherRepository.save(pub);

        //Shiv
        Author shiv = new Author("William","Shakespeare");
        Book newBook = new Book("Romeo and Juliet","abcd",pub);

        shiv.getBooks().add(newBook);
        newBook.getAuthors().add(newBook);

        authorRepository.save(shiv);
        bookRepository.save(newBook);

        //Shake
        Author ss = new Author("Neil","Gaiman");
        Book rl = new Book("American Gods","xyz",pub);
        ss.getBooks().add(rl);

        authorRepository.save(ss);
        bookRepository.save(rl);










    }
}
