package com.socialartnetwork.like;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
