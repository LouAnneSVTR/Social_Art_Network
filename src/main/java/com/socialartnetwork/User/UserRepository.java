package com.socialartnetwork.User;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface UserRepository extends DatastoreRepository<User, Long> {

    List<User> findAll();

    Optional<User> findByEmail(String email);

    List<User> findUserById(Integer id);

    List<User> findUserByEmail(String email);

}
