package com.socialartnetwork.Friend;

import com.socialartnetwork.User.User;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "friends", path = "friend")
public interface FriendRepository extends DatastoreRepository<Friend, Long> {

    boolean existsByFirstUserAndSecondUser(User firstUser,User secondUser);

    List<Friend> findByFirstUser(User user);
    List<Friend> findBySecondUser(User user);

}