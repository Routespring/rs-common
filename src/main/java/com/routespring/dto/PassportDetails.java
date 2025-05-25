package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassportDetails {
	String passportNumber = "";
	String passportExpiryDate = "";
	String passportCountryCode = "US";
}
