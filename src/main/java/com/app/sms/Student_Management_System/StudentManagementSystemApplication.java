package com.app.sms.Student_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.sms.Student_Management_System.Repository.StudentRepository;
import com.app.sms.Student_Management_System.model.Student;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Raj", "Kundra", "raj12@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sai", "Rai", "sai12@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Siraj", "Khan", "siraj12@gmail.com");
//		studentRepository.save(student3);
		
	}

	
	

}
