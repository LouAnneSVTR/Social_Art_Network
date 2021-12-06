package com.socialartnetwork.like;


import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

@Entity(name = "likes")
public class Like {

    @Id
    @Column(name = "post")
    private Long id;

    @Column(name = "user_post")
    private Long UserPostId;

    @Column(name = "user_like")
    private Long userId;
}
