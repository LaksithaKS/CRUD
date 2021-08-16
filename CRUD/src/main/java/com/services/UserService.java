package com.services;


import java.util.List;
import java.util.Optional;

import com.models.User;

public interface UserService {
	
	User addUser(User user);
	
	List<User> getAllUsers();
	
	Optional<User> getUserById(int id);
	
	
	
}