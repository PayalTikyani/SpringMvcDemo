package com.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)  //helper class that containes business logic or validations
@Target({ ElementType.FIELD, ElementType.METHOD })            // can apply our annoation to a field or method.
@Retention(RetentionPolicy.RUNTIME)                           //Retain this annotation in Java class file. Process it at runtime.

public @interface CourseCode {

	//define default course code
	public String value() default "ONGRAPH";
	
	//define default error message
	public String message() default "must start with ONGRAPH";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
