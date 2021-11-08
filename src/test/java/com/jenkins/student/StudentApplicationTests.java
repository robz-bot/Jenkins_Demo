package com.jenkins.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jenkins.student.entity.Student;
import com.jenkins.student.repository.StudentRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class StudentApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	@Order(1)
	public void testNewStudent() {
		Student stu = new Student(1L, "Robin", "8484848484");
		studentRepository.save(stu);
		assertEquals(1L, 1L);
	}

	@Test
	@Order(2)
	public void testGetAllStudents() {
		studentRepository.findAll();
		assertTrue(studentRepository.findAll().size() > 0);
	}

	@Test
	@Order(3)
	public void testDeleteStudent() {
		studentRepository.deleteById(1L);
		assertTrue(studentRepository.findById(1L) == null);
	}
}
