package com.routespring.dto.signin;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResetPasswordRequest {
	@NotBlank(message = "Email must not be blank")
	@Email(message = "Invalid email format")
	private String email;

}
