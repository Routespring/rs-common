package com.routespring.dto.booking.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.routespring.dto.Airport;
import com.routespring.dto.FlightResultList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse extends BookingResponseBase {

	FlightResultList changedFlights;
	FlightResultList bookedFlights;
	FlightResultList allFlights;

	Map<String, String> airlineNames = new HashMap<String, String>();
	Map<String, Airport> airports = new HashMap<String, Airport>();

}
