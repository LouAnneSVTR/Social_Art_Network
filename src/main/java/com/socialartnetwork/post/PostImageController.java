package com.socialartnetwork.post;

import com.socialartnetwork.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8080/")
public class PostImageController {

    @Autowired
    private PostImageRepository postImageRepository;

    @GetMapping("/postimages")
    public List<PostImage> fetchImages() {
        return this.postImageRepository.findAll();
    }
}
