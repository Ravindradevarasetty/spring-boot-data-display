package com.data.display.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.display.modal.User;
import com.data.display.service.UserServices;

@RestController
public class UserController {
 
    @Autowired
    private UserServices service;
     
    @GetMapping("/users")
    public List<User> getAllUsers(){
    	List<User> users = service.getAllUsers();
    	return users;
    }
    @PostMapping("/save/user")
    public User saveUser(@RequestBody User user) {
    	User storeUser  = service.saveUser(user);
    	return storeUser;
    }
    @DeleteMapping("/delete/{id}")
    public int deleteUserById(@PathVariable("id") int id) {
    	service.delete(id);
    	return id;
    }
    
}
