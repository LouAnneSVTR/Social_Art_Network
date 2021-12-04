package com.socialartnetwork.Friend;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "friends", path = "friend")
public interface FriendRepository extends DatastoreRepository<Friend, Long> {

    //boolean existsByFirstUserAndSecondUser(Long firstUser,Long secondUser);

    List<Friend> findFriendByIdFirstUser(Long user);

    List<Friend> findFriendByIdSecondUser(Long user);

}