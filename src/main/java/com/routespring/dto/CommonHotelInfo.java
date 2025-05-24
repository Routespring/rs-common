package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonHotelInfo {

	@JsonProperty
	private String hotelChain;
	@JsonProperty
	private String traflaHotelChain;
	@JsonProperty
	private String hotelCode;

	@JsonProperty
	private String hotelLocation;
	@JsonProperty
	private String hotelName;

	@JsonProperty
	private String address;

}
