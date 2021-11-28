package com.socialartnetwork;


import com.socialartnetwork.User.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class SocialArtNetworkApplication {



    public static void main(String[] args) {
        SpringApplication.run(SocialArtNetworkApplication.class, args);
    }






}
