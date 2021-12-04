package com.socialartnetwork.post;

import com.socialartnetwork.User.User;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface PostRepository extends DatastoreRepository<Post, Long> {

    List<Post>  findPostByUserId(Long userId);

    List<Post> findALlByOrderByIdDesc();

}