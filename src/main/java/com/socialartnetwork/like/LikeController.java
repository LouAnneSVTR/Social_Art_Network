package com.socialartnetwork.like;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8080/")
public class LikeController {

    @Autowired
    private LikeRepository likeRepository;

    @GetMapping("/likes")
    public List<Like> fetchUser() {
        return likeRepository.findAll();
    }

    //TODO : implémentation des buckets, gestion avec google

}
