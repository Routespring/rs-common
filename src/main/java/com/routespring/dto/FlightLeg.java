package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightLeg {
	List<FlightHop> flightHops;
	TrafficTimes timeToAirport;
	TrafficTimes timeFromAirport;
	FlightHighlights flightHighlights;
	String confirmationNumber;
	String legId;
	String dataSource;
	List<BrandDetails> brandDetails;
	BaggageDetails baggageAllowance;
	private BaggageDetails carryOnAllowance;
	Scoring scores;
//	List<OptionalService> optionalServices;

}
