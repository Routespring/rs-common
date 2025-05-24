package com.routespring.dto.signin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchQuery {
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
