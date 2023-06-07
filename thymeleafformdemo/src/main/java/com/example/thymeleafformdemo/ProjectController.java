package com.example.thymeleafformdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// sourced from from:
//
// https://attacomsian.com/blog/spring-boot-thymeleaf-form-handling
//

@Controller
public class ProjectController {
	
	private List<Project> listProject = new ArrayList<>();

    @GetMapping("/create-project")
    public String createProjectForm(Model model) {

        model.addAttribute("project", new Project());
        return "create-project";
    }

    @PostMapping("/save-project")
    public String saveProjectSubmission(@ModelAttribute Project project) {

        listProject.add(project);

        return "result";
    }
    
	@GetMapping("/project")
    public String listProjects(Model model) {
    	model.addAttribute("project", listProject);
        return "project";
    }
	
}