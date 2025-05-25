package com.routespring.dto;

public enum TraflaPassengerType {
	ADULT("ADT"), CHILD("CHD"), INFANT("INF"), INFANT_WITH_SEAT("INS");

	private String value;

	// Constructor
	TraflaPassengerType(String value) {
		this.value = value;
	}

}
