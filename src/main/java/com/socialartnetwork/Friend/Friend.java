package com.socialartnetwork.Friend;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name= "friends")
public class Friend {

    @Id
    private Long id;

    private Date createdDate;

    private Long idFirstUser;

    private Long idSecondUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getFirstUser() {
        return this.idFirstUser;
    }

    public void setFirstUser(Long firstUser) {
        this.idFirstUser = firstUser;
    }

    public Long getSecondUser() {
        return this.idSecondUser;
    }

    public void setSecondUser(Long secondUser) {
        this.idSecondUser = secondUser;
    }
}