package com.routespring.dto.auth.request.custom.validations;

import com.routespring.dto.auth.request.ResetPasswordConfirmationRequest;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordsMatchValidator implements ConstraintValidator<PasswordsMatch, ResetPasswordConfirmationRequest> {

	@Override
	public boolean isValid(ResetPasswordConfirmationRequest dto, ConstraintValidatorContext context) {
		if (dto == null)
			return true; // let @NotBlank handle nulls elsewhere

		return dto.getOldPassword() != null && dto.getOldPassword().equals(dto.getNewPassword());
	}
}
