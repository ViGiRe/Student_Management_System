package com.app.sms.Student_Management_System.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.sms.Student_Management_System.Service.StudentService;
import com.app.sms.Student_Management_System.model.Student;

@Controller
public class StudentController {
	//spring bean has only 1 constructor
	private StudentService studentService;

	//if we have only 1 constructor then we can use arg-constructor than @autowired
	private StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listOfStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";//view
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		//create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create-student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		//save student object to db
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit-student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model) {
		
		//get student from db by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
	
}
