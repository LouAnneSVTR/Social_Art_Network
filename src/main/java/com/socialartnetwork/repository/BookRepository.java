/*package com.socialartnetwork.repository;

import java.util.List;

import com.socialartnetwork.entity.Book;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "books", path = "book")
public interface BookRepository extends DatastoreRepository<Book, String> {

    List<Book> findByAuthor(String author);

    List<Book> findByYearGreaterThan(int year);

    List<Book> findByAuthorAndYear(String author, int year);
}*/