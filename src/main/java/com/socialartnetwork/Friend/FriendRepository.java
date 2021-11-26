/*package com.webandcloud.Friend;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.webandcloud.User.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendRepository extends DatastoreRepository<User, Long> {

    boolean existsByFirstUserAndSecondUser(User first,User second);

    List<Friend> findByFirstUser(User user);
    List<Friend> findBySecondUser(User user);

}*/