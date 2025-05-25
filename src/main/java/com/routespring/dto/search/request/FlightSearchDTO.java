package com.routespring.dto.search.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.routespring.dto.signin.LegRequest;
import com.routespring.dto.signin.TravellerInputForSearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightSearchDTO {
	List<LegRequest> requests;
	String combo;
	TravellerInputForSearch travellers;
	String tripType;

	@JsonProperty("filtered_airlines")
	List<String> filteredAirlines;

	@JsonProperty("src_filtered_airports")
	List<String> srcFilteredAirports;

	@JsonProperty("dest_filtered_airports")
	List<String> destFilteredAirports;

	List<String> travellerEmails;
	List<String> preferredAirlines;

}
