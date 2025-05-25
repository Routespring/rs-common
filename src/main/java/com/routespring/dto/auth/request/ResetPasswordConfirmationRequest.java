package com.routespring.dto.auth.request;

import com.routespring.dto.auth.request.custom.validations.StrongPassword;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResetPasswordConfirmationRequest {

	@NotBlank(message = "sToken must not be blank")
	private String sToken;

	@NotBlank(message = "Email must not be blank")
	@Email(message = "Invalid email format")
	private String email;

	@NotBlank(message = "Old password must not be blank")
	private String oldPassword;

	@StrongPassword
	@NotBlank(message = "New password must not be blank")
	private String newPassword;

}
