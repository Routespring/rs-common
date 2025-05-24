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
public class PhoneNumberDTO {

	@JsonProperty("number")
	private String number;

	@JsonProperty("areaCode")
	private String areaCode;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("type")
	private String type;

}
