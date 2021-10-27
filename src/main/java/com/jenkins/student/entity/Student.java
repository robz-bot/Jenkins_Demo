/**
 * 
 */
package com.jenkins.student.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ROBIN RAJESH
 *
 */
@Document(collection = "student")
public class Student {

	@Id
	private Long _id;

	private String studentName;
	private String studentContact;
	
	
	/**
	 * @param _id
	 * @param studentName
	 * @param studentContact
	 */
	public Student(Long _id, String studentName, String studentContact) {
		super();
		this._id = _id;
		this.studentName = studentName;
		this.studentContact = studentContact;
	}
	/**
	 * @return the _id
	 */
	public Long get_id() {
		return _id;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @return the studentContact
	 */
	public String getStudentContact() {
		return studentContact;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(Long _id) {
		this._id = _id;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @param studentContact the studentContact to set
	 */
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	
	
}
