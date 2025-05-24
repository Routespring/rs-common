package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarSearchRequest extends CarRequest {

	private String dropLocation;
	private String pickLocation;

	private String latitudePickUp;
	private String longitudePickUp;
	private String latitudeDropOff;
	private String longitudeDropOff;
	private String pickupCode;
	private String pickUpDate;
	private String pickupTime;
	private String dropoffDate;
	private String dropoffTime;

	private String dropOffType;
	private String pickupType;
	private boolean isSameLocation;
	private String preferredCurrency = "USD";

}
