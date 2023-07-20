package com.perscholas.capstone.service;

import com.perscholas.capstone.model.User;

public interface UserService {
	
	User saveUser(User user);
	
	User getUserById(Long id);
	
	User updateStudent(User user);
	
	void deleteUserById(Long id);
	
}
