package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarSearch {

	@JsonProperty("pick_lat")
	private String latitudePickUp;
	@JsonProperty("pick_long")
	private String longitudePickUp;

	@JsonProperty("drop_lat")
	private String latitudeDropOff;
	@JsonProperty("drop_long")
	private String longitudeDropOff;

	@JsonProperty("dropLocation")
	private String dropLocation;
	@JsonProperty("pickLocation")
	private String pickLocation;

	@JsonProperty("pickDate")
	private String pickUpDate;
	@JsonProperty("pickTime")
	private String pickupTime;

	@JsonProperty("dropDate")
	private String dropoffDate;
	@JsonProperty("dropTime")
	private String dropoffTime;

	private String dropOffType;
	private String pickupType;
	private boolean isSameLocation;

	private String travellerEmail;

}
