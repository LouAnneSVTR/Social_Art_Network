package com.webandcloud.social_art_network;

//import com.google.api.client.util.Lists;
//import com.webandcloud.User.User;
//import com.webandcloud.User.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
public class SocialArtNetworkApplication {

   // @Autowired
   // UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SocialArtNetworkApplication.class, args);
    }

    /*public String saveUser(Integer userId, String userFirstName, String userLastName, String userEmai) {
        User savedUser = this.userRepository.save(new User(18, "Sauv", "Lou", "lou@email.com"));
        return savedUser.toString();
    }

    public String findAllUser() {
        Iterable<User> users = this.userRepository.findAll();
        return Lists.newArrayList(users).toString();
    }*/

}
