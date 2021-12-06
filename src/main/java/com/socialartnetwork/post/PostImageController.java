package com.socialartnetwork.post;

import com.socialartnetwork.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/postimages")
    public PostImage save(@RequestBody PostImage image) {
        return postImageRepository.save(image);
    }
}
