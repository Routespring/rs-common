package com.routespring.dto.auth.request.custom.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = StrongPasswordValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface StrongPassword {
	String message() default "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
