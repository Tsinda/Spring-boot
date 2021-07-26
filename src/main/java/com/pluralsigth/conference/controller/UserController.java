package com.pluralsigth.conference.controller;

import com.pluralsigth.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")

    public User getUser(@RequestParam(value = "firstname",defaultValue = "Philemon") String fName,
                        @RequestParam(value = "lastname",defaultValue = "Kalisa") String lName,
                        @RequestParam(value = "age",defaultValue = "10" ) int age){
        User user = new User();
        user.setFirstname(fName);
        user.setLastname(lName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        return user;
    }

}
