package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	 @Autowired  
	 private UserService userService;
	 
	    @RequestMapping("/")  
	    public List<User> getAllUser(){  
	        return userService.getAllUsers();  
	    }     
	    @RequestMapping(value="/add-user", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)  
	    public void addUser(@RequestBody User userRecord){  
	        userService.addUser(userRecord);  
	    }  
	    
	    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
	    public User getUser(@PathVariable String id){  
	        return userService.getUser(id);  
	    }  
	
}
