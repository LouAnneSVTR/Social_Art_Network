package com.webandcloud.User;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "name")
    private String userName;

    @Column(name = "email")
    private String userEmail;

}
