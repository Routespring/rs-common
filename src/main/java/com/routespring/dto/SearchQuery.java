
package com.routespring.dto;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.routespring.dto.FlightSearchOptions.SeatClass;
import com.routespring.dto.signin.TravellerInputForSearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchQuery {
	List<LegRequest> requests;
	String combo;
	TravellerInputForSearch travellers;
	SeatClass cabinClass;
	String tripType;
	@JsonProperty("filtered_airlines")
	List<String> filteredAirlines;
	@JsonProperty("src_filtered_airports")
	List<String> srcFilteredAirports;
	@JsonProperty("dest_filtered_airports")
	List<String> destFilteredAirports;
	@JsonProperty("selected_legs")
	List<List<FlightHop>> selectedLegs;
	List<String> travellerEmails;
	HashMap<TraflaFlightClass, Double> minPrices = new HashMap<>();
	List<String> previousSelectedCreditAirline;
	String previousTransactionid;
	List<String> preferredAirlines;
	AlgoTypes algoType = AlgoTypes.PODUCTIVITY;

}
