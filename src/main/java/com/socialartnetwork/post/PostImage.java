package com.socialartnetwork.post;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Entity(name = "posts")
public class PostImage {

    @Id
    private Long id;

    private Long userId;

    private String imageURL;

    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser() {
        return userId;
    }

    public void setUser(Long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return imageURL;
    }

    public void setContent(String content) {
        this.imageURL = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
