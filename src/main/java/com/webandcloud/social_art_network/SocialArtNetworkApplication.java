package com.webandcloud.social_art_network;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
public class SocialArtNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialArtNetworkApplication.class, args);
    }

}
