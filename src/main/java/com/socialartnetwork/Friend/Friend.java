package com.socialartnetwork.Friend;

import java.util.Date;
import com.socialartnetwork.User.User;
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
    private Integer id;

    private Date createdDate;

    private User firstUser;

    private User secondUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getFirstUser() {
        return firstUser;
    }

    public void setFirstUser(User firstUser) {
        this.firstUser = firstUser;
    }

    public User getSecondUser() {
        return secondUser;
    }

    public void setSecondUser(User secondUser) {
        this.secondUser = secondUser;
    }
}