package com.socialartnetwork.like;


import com.socialartnetwork.User.User;
import com.socialartnetwork.post.Post;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

@Entity(name = "likes")
public class Like {

    @Id
    @Column(name = "post")
    private Post post;

    @Column(name = "user_post")
    private User UserPost;

    @Column(name = "user_like")
    private User userLike;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUserPost() {
        return UserPost;
    }

    public void setUserPost(User userPost) {
        UserPost = userPost;
    }

    public User getUserLike() {
        return userLike;
    }

    public void setUserLike(User userLike) {
        this.userLike = userLike;
    }
}
