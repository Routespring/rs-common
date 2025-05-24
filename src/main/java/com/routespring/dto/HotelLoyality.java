package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "chain", "number", "hotel_name" })
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelLoyality {
	@JsonProperty("chain")
	private String chain;

	@JsonProperty("number")
	private String number;

	@JsonProperty("hotel_name")
	private String hotelName;

}
