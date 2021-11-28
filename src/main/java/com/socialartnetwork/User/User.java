package com.socialartnetwork.User;

/*import com.google.cloud.Date;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
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

}*/

/*import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "users")
public class User {
    @Id
    private Integer id;

    private String uid;

    private String name;

    private String email;

    private String picture;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public User() {
    }
}
*/