package com.socialartnetwork.post;

import com.socialartnetwork.User.User;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "postimages", path = "postimages")
public interface PostImageRepository extends DatastoreRepository<PostImage, Long> {

    List<Post>  findPostImageByUserId(User userId);

    List<Post> findALlImageByOrderByIdDesc();

}