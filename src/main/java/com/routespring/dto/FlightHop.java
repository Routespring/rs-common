package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightHop {
	String id;
	String from;
	String to;
	String starts;
	String ends;
	String carrier;
	String operatingCarrier;
	String duration;
	String destinationTerminal;
	String sourceTerminal;
	String imageUrl;
	String flightNumber;
	String allianceName;
	String isLcc;
	String cabinClass;
	String classCode;
	String fareBasisCode;
	String avaailabiltyType;
	String availabilitySource;
	String classOfService;
	String brandClass;
	@JsonProperty("BookingCode")
	String BookingCode;
	String brandDetail;
	String fareClassName;
	int ngsStars = -1;

}
