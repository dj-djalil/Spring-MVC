package com.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// value : -> is the html form data entered by the user

		// check if does it satart with "LUV"
		boolean result = value.startsWith(coursePrefix);
		return result;
	}

}
