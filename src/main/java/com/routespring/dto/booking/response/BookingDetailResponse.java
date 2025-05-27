package com.routespring.dto.booking.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.routespring.dto.Airport;
import com.routespring.dto.TravellersData;
import com.routespring.dto.TripDetailBookedOption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "travellersData", "tripDetail", "isTripApprovalPending", "airlineNames", "airports" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetailResponse {

	private TravellersData travellersData;

	@JsonProperty("tripDetail")
	private List<TripDetailBookedOption> tripDetail;

	@JsonProperty("isTripApprovalPending")
	private Boolean isTripApprovalPending;

	@JsonProperty("airlineNames")
	Map<String, String> airlineNames = new HashMap<String, String>();
	@JsonProperty("airports")
	Map<String, Airport> airports = new HashMap<String, Airport>();

}
