package com.perscholas.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.perscholas.capstone.model.User;
import com.perscholas.capstone.repository.UserRepository;
import com.perscholas.capstone.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class UserController {

	private UserService userService;
	private UserRepository userRepository;
	
	 @Autowired
	 public UserController(UserRepository userRepository) {
		 this.userRepository = userRepository;
	 }
	
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/login";
	}
	
	@PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        // Perform user authentication (in-memory authentication for now)
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            // Successful login, redirect to the homepage or some other page
            return "redirect:/students";
        } else {
            // Failed login, show the login page with an error message
            model.addAttribute("error", "Invalid username or password");
            return "redirect:/login";
        }
    }
}
