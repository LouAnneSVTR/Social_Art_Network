package com.socialartnetwork.User;

import java.util.List;
import java.util.Optional;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends DatastoreRepository<User, Long> {

    List<User> findAll();

    Optional<User> findByEmail(String email);

    List<User> findUserByUserLastName(String userLastName);

    List<User> findUserByUserFirstName(String userFirstName);

}

/*
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "users", path = "user")
public interface UserRepository extends DatastoreRepository<User, String> {

    List<User> findByEmail(String email);

    List<User> findByUid(String uid);

    List<User> findByName(String name);

}
 */
