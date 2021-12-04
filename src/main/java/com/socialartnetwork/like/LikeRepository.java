package com.socialartnetwork.like;

import java.util.List;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "likes", path = "likes")
public interface LikeRepository extends DatastoreRepository<Like, Long> {

    List<Like> findAll();

}
