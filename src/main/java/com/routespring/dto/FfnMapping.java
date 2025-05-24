package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "frequent_flyer_number", "airline_code" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FfnMapping {

	@JsonProperty("name")
	private String name;

	@JsonProperty("frequent_flyer_number")
	private String frequentFlyerNumber;

	@JsonProperty("airline_code")
	private String airlineCode;

}