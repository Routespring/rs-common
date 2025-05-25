package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "price", "currency", "duration", "hops" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTripFlightOption {
	@JsonProperty("flightHandlerType")
	private String flightHandlerType;
	@JsonProperty("legid")
	private String legid = "legid";
	@JsonProperty("price")
	private String price;
	@JsonProperty("discountedPrice")
	private String discountedPrice;
	@JsonProperty("bookedOn")
	private String bookedOnDateTime;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("duration")
	private String duration;
	@JsonProperty("stops")
	private String stops;
	@JsonProperty("fareType")
	private String fareType;
	@JsonProperty("hops")
	private List<UserTripFlightHop> hops;
	@JsonProperty("lowToFairPrice")
	private Boolean lowToFairPrice = false;
	@JsonProperty("preferredAirline")
	private Boolean preferredAirline = false;
	@JsonProperty("preferredAirport")
	private Boolean preferredAirport = false;
	@JsonProperty("withinPricePolicy")
	private Boolean withinPricePolicy = false;
	@JsonProperty("isPassportMandatory")
	private Boolean isPassportMandatory = false;
	@JsonProperty("isZipcodeMandatory")
	private Boolean isZipcodeMandatory = false;

	@JsonProperty("serviceFee")
	private String serviceFee;

	private String displayCurrency;
	private Double displayPrice;

}
