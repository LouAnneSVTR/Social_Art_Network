package com.webandcloud.User;

import java.util.List;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface UserRepository extends DatastoreRepository<User, Long> {

    List<User> findUserByFirstName(String firstName);

    List<User> findUserByLastName(String lastName);

    List<User> findUserByUserEmail(String email);

}
