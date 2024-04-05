package com.app.sms.Student_Management_System.Service;

import java.util.List;

import com.app.sms.Student_Management_System.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteStudentById(Long id);
}
