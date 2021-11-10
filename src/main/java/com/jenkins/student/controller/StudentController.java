/**
 * 
 */
package com.jenkins.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.student.entity.Student;
import com.jenkins.student.repository.StudentRepository;

/**
 * @author ROBIN RAJESH
 * 04/11/2021
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@PostMapping("/addNewStudent")
	public String addNewStudent(@RequestBody Student student) {
		if (student != null) {
			studentRepository.save(student);
			return student.getStudentName() + " Saved Successfuly";
		}
		return "Error in saving student";
	}

	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable String id) {
		if (id != null) {
			studentRepository.deleteById(Long.parseLong(id));
			return "Student Deleted Successfuly";
		}
		return "Error in deleting student";
	}
}
