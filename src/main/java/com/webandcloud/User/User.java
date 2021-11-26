package com.webandcloud.User;

import com.google.cloud.Date;
import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;



@Entity(name = "users")
public class User {

    @Id
    private Integer userId;

    private String userFirstName;

    private String userLastName;

    private String userEmail;

    private Date dateOfSubcribtion;

    public User(String userFirstName, String userLastName, String userEmail) {

        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.userId +
                ", first name='" + this.userFirstName + '\'' +
                ", last name ='" + this.userLastName + '\'' +
                ", email=" + this.userEmail +
                '}';
    }

}
