package com.oocl.web.sampleWebApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private List<User> users = new ArrayList<User>();
    
    UserController(){
        users.add(new User("001","xiaoming"));
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<User>> queryUser() {
        return ResponseEntity.ok(users);
    }
    @PutMapping
    public ResponseEntity<List<User>> updateUser() {
        return ResponseEntity.ok(users);
    }
}
