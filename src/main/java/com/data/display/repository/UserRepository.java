package com.data.display.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.data.display.modal.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
 
