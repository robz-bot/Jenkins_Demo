/**
 * 
 */
package com.jenkins.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jenkins.student.entity.Student;

/**
 * @author ROBIN RAJESH
 *
 */
public interface StudentRepository extends MongoRepository<Student, Long>{

}