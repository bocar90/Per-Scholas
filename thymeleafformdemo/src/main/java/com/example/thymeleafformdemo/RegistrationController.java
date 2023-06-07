package com.example.thymeleafformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

	@GetMapping("/signup")
	public String registrationForm(Model model) {
		model.addAttribute("register", new RegistrationPOJO());
		return "registration";
	}
	
	@PostMapping("/save-registration")
    public String saveRegistrationSubmission(Model model, RegistrationPOJO register) {
    	System.out.println(">>>>>> IN saveRegistrationSubmission");
    	System.out.println(">>>>>> username = " + register.getUsername());
    	System.out.println(">>>>>> password = " + register.getPassword());
        // TODO: 
    	model.addAttribute("register", register);
        return "register-result";
    }
	
}
