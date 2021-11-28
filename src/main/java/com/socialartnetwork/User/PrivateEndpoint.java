/*package com.socialartnetwork.User;

import com.socialartnetwork.User.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("private")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PrivateEndpoint {

    @Autowired
    UserService userService;

    //@Autowired
    //FriendService friendService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    //@Autowired
    //SecurityService securityService;

    @GetMapping("user-details")
    public ResponseEntity<?> getUserInfo(/*@AuthenticationPrincipal UserDto userDto) {
        User user = userService.getUser(userDto.getEmail());
        return ResponseEntity.ok(user);
    }

    @GetMapping("saveUser")
    public ResponseEntity<UserDto> saveUserInfo(/*@AuthenticationPrincipal UserDto userDto) {
        userService.saveUser(userDto);
        return ResponseEntity.ok(userDto);
    }
}
*/