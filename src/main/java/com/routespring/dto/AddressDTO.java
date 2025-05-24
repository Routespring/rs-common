package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressDTO {

	@JsonProperty("address")
	private String address;
	@JsonProperty("lattitude")
	private String lattitude;
	@JsonProperty("longitude")
	private String longitude;
	@JsonProperty("type")
	private String type;
	@JsonProperty("city")
	private String city;
	@JsonProperty("country_code")
	private String countryCode;
	@JsonProperty("state_code")
	private String stateCode;
	@JsonProperty("postal_code")
	private String postalCode;

}
