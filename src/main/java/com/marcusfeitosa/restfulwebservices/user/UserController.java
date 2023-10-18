package com.marcusfeitosa.restfulwebservices.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserDaoService service;

    public UserController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User getOneUsers(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("user")
    public void createUser(@RequestBody User user){
        service.saveUser(user);
    }

}
