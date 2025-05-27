package com.routespring.dto;

public enum PassengerType {
	ADULT("ADT"), CHILD("CHD"), INFANT("INF"), INFANT_WITH_SEAT("INS");

	private String value;

	// Constructor
	PassengerType(String value) {
		this.value = value;
	}

}
