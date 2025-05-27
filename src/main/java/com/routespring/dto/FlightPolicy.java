package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightPolicy {
	private FlightClass maxFlightClassAllowed;
	private boolean considerBasicEconomy = false;
	private UpperClassReason upperClassReason;
	private int flightDurationForUpperClass;

}
