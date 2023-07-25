package com.data.display.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.data.display.modal.User;
import com.data.display.repository.UserRepository;

@Service
@Transactional
public class UserServices {
     
    @Autowired
    private UserRepository repo;
    
    public List<User> getAllUsers()   
    {  
    List<User> users = new ArrayList<User>();  
    repo.findAll().forEach(user -> users.add(user));  
    return users;  
    }  
    public Optional<User> getUserById(int id) {
    	Optional<User> user = repo.findById(id);
    	return user;
    }
    public User saveUser(User user) {
    	User saveUser = repo.save(user);
    	return saveUser;
    }
    public void delete(int id) {
    	repo.deleteById(id);
    	
    }
}