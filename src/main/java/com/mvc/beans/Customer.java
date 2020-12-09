package com.mvc.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mvc.validation.CourseCode;

 
public class Customer {

	private String firstName;
	// for Required field
	@NotNull()
	@Size(min = 1, message = "{msg}")
	private String lastName;
	
	@NotNull(message="is required")
	//for Number Range
	@Min(value=10 ,message="age must be greater than 10 years old")
	@Max(value=50, message="age must be less than 50 years old")
	private Integer age;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message ="only 5 chars/digits")
	private String postalCode;
	
	@NotBlank
	private String adress;
	
	// custom validation
	@CourseCode
	private String courseCode;
	

	// getters and setters 
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	//////////////////////////////////
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", postalCode="
				+ postalCode + ", adress=" + adress + ", courseCode=" + courseCode + "]";
	}

	// to String Methode 
	
}
