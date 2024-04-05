package com.app.sms.Student_Management_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.sms.Student_Management_System.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
