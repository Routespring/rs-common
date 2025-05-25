package com.routespring.dto.auth.request.custom.validations;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, String> {

	private static final Pattern UPPER = Pattern.compile("[A-Z]");
	private static final Pattern LOWER = Pattern.compile("[a-z]");
	private static final Pattern DIGIT = Pattern.compile("[0-9]");
	private static final Pattern SPECIAL = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]");

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
		if (password == null)
			return false;
		if (password.length() < 8)
			return false;
		if (!UPPER.matcher(password).find())
			return false;
		if (!LOWER.matcher(password).find())
			return false;
		if (!DIGIT.matcher(password).find())
			return false;
		if (!SPECIAL.matcher(password).find())
			return false;

		return true;
	}
}
