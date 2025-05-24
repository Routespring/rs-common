package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassportDTO {

	@JsonProperty("passportNumber")
	private String passportNumber;

	@JsonProperty("expiryDate")
	private String expiryDate;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("countryName")
	private String countryName;

}
