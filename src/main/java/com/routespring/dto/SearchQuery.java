
package com.routespring.dto;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.routespring.dto.FlightSearchOptions.SeatClass;
import com.routespring.dto.signin.TravellerInputForSearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchQuery {
	List<LegRequest> requests;
	String combo;
	TravellerInputForSearch travellers;
	SeatClass cabinClass;
	String tripType;

	@JsonProperty("filtered_airlines")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	List<String> filteredAirlines;
	
	@JsonProperty("src_filtered_airports")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	List<String> srcFilteredAirports;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("dest_filtered_airports")
	List<String> destFilteredAirports;
	@JsonProperty("selected_legs")
	List<List<FlightHop>> selectedLegs;
	List<String> travellerEmails;
	HashMap<FlightClass, Double> minPrices = new HashMap<>();
	@JsonInclude(JsonInclude.Include.NON_NULL)
	List<String> previousSelectedCreditAirline;
	String previousTransactionid;
	List<String> preferredAirlines;
	AlgoTypes algoType = AlgoTypes.PODUCTIVITY;

}
