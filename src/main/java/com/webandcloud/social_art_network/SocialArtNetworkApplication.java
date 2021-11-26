package com.webandcloud.social_art_network;

//import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Lists;
import com.webandcloud.User.User;
import com.webandcloud.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;


@SpringBootApplication
@ShellComponent
public class SocialArtNetworkApplication {

   @Autowired
   UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SocialArtNetworkApplication.class, args);
    }

    @ShellMethod("Save a user to cloud Datastore: save-user <userFirstName> <userLastName> <userEmai>")
    public String saveUser(String userFirstName, String userLastName, String userEmai) {
        User savedUser = this.userRepository.save(new User(userFirstName, userLastName, userEmai));
        return savedUser.toString();
    }

    @ShellMethod("Loads all users")
    public String findAllUser() {
        Iterable<User> users = this.userRepository.findAll();
        return Lists.newArrayList(users).toString();
    }

    @ShellMethod("Loads Users by author: find-by-firstName <userFirstName>")
    public String findByFirstName(String userFirstName) {
        List<User> Users = this.userRepository.findUserByFirstName(userFirstName);
        return Users.toString();
    }

    @ShellMethod("Loads Users published after a given year: find-by-lastname <userLastName>")
    public String findByLastName(String userLastName) {
        List<User> Users = this.userRepository.findUserByLastName(userLastName);
        return Users.toString();
    }

    @ShellMethod("Loads Users by author and year: find-by-email <userEmail>")
    public String findByEmail(String userEmail) {
        List<User> Users = this.userRepository.findUserByUserEmail(userEmail);
        return Users.toString();
    }

    @ShellMethod("Removes all Users")
    public void removeAllUsers() {
        this.userRepository.deleteAll();
    }


}
