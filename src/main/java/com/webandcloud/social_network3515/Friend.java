package com.webandcloud.social_network3515;

import nonapi.io.github.classgraph.json.Id;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.Entity;

@Entity
@Table(name= "friends")
public class Friend {

    @Id
    @GenerateValue(strategy = GenerationTYpe.IDENTIY)
    private Integer id;

    @Column(name = "date")
    private Date friendshipDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "first_user_id", referencedColumnName = "id")
    User firstUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "second_user_id", referencedColumnName = "id")
    User secondUser;

    public Friend() {
    }

    public Integer getId() {
     return id;
    }

    public void setId(Integer id) {
     this.id = id;
    }

    public Date getFriendshipDate() {
     return friendshipDate;
    }

    public void setFriendshipDate(Date date) {
     this.friendshipDate = date;
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
