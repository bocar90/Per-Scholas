package com.perscholas.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perscholas.capstone.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
