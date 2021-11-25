/*package com.webandcloud.User;

import com.google.cloud.Date;
import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;


@Entity
public class User {

    @Id
    private Integer userId;

    private String userFirstName;

    private String userLastName;

    private String userEmail;

    private Date dateOfSubcribtion;

    public User(Integer userId, String userFirstName, String userLastName, String userEmail) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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
*/