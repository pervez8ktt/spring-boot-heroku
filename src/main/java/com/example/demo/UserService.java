package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	  @Autowired
	    private UserRepo userRepository;  
	  
	    public List<User> getAllUsers(){  
	        List<User>userRecords = new ArrayList<>();  
	        userRepository.findAll().forEach(userRecords::add);  
	        return userRecords;  
	    }  
	    public User getUser(String id){  
	        return userRepository.findOne(id);  
	    }  
	    public void addUser(User userRecord){  
	        userRepository.save(userRecord);  
	    }  
	    public void delete(String id){  
	        userRepository.delete(id);  
	    }  
	
}
