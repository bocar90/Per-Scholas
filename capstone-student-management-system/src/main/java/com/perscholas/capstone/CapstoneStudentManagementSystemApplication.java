package com.perscholas.capstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perscholas.capstone.model.Student;
import com.perscholas.capstone.repository.StudentRepository;

@SpringBootApplication
public class CapstoneStudentManagementSystemApplication implements CommandLineRunner {
    
	public static void main(String[] args) {
		SpringApplication.run(CapstoneStudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Fatoumata", "Doumbouya", "fatdoumb23@gmail.com", "Yattaya");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("M'Mah", "Keita", "mahkeita@gmail.com", "Yattaya");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Boubacar", "Diallo", "boubacardgp@gmail.com", "Wanindara ");
//		studentRepository.save(student3);
	}

}
