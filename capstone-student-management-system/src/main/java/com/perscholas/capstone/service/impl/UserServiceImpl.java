package com.perscholas.capstone.service.impl;

import org.springframework.stereotype.Service;

import com.perscholas.capstone.model.User;
import com.perscholas.capstone.repository.UserRepository;
import com.perscholas.capstone.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User updateStudent(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}
	
}
 