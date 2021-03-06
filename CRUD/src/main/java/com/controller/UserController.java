package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.User;
import com.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
	    return userService.addUser(user);
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<User> getUserById(@PathVariable Integer id){
		return userService.getUserById(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable Integer id) {
		return userService.updateUser(user, id);
	}
	
	@DeleteMapping("deleteUser/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id); 
	}
	
	
}
