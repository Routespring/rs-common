package com.routespring.dto.auth.request.custom.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordsMatchValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordsMatch {
	String message() default "New password must match old password";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
