package com.app.sms.Student_Management_System.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.sms.Student_Management_System.Repository.StudentRepository;
import com.app.sms.Student_Management_System.Service.StudentService;
import com.app.sms.Student_Management_System.model.Student;
@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	private StudentServiceImpl(StudentRepository repo) {
		super();
		this.studentRepository = repo;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
