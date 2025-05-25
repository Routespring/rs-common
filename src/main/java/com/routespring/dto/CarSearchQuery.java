package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarSearchQuery {

	private String pickUp;
	private String dropOff;
	private String dropOffLat;
	private String dropOffLng;
	private String pickUpLat;
	private String pickUpLng;
	private String pickUpDate;
	private String dropOffDate;
	private String pickTime;
	private String dropTime;
	private String dropOffType;
	private String pickupType;
	private Boolean sameDropOff;
	private String travellerEmail;

}
