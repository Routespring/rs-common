package com.routespring.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightsSearchResults {
	ApprovalRequiredFor approvalRequiredFor;
	boolean travelPurposeMandatory = false;
	Map<String, String> airlineNames;
	Map<String, Airport> airports;
	Map<String, String> cabinClassNames;
	List<FlightResultList> flightsLists;
	ScoringLabels scoringLabels;
	private boolean isPolicySet;
	FlightPolicy flightPolicy;
	FlightPolicy internationalFlightPolicy;
	SearchResultSummary summary;

}
