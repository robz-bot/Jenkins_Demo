package com.jenkins.student;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jenkins.student.entity.Student;
import com.jenkins.student.repository.StudentRepository;

@SpringBootTest
class StudentApplicationTests {
	
	@Autowired
	StudentRepository studentRepository;

	@Test
	public void testNewStudent() {
		Student stu=new Student(1L,"Robin","8484848484");
		studentRepository.save(stu);
		assertEquals(1L,1L);
	}
	
	@Test 
	public void testGetAllStudents() {
		studentRepository.findAll();
		assertTrue(studentRepository.findAll().size()>0);
	}
	

}
