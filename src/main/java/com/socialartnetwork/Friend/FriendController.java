package com.socialartnetwork.Friend;


import com.socialartnetwork.User.User;
import com.socialartnetwork.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8080/")
public class FriendController {

    @Autowired
    private FriendRepository friendRepository;

    private Long firstUserId;

    private Long lastUserId;

    @GetMapping("/users")
    public List<Friend> fetchFriend() {
        return friendRepository.findFriendByIdFirstUser(firstUserId);
    }
}
