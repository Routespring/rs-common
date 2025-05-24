package com.routespring.dto;

public enum TraflaFlightClass {
	ECONOMY("Economy", 1), PREMIUM_ECONOMY("Premium economy", 2), BUSINESS("Business", 3),
	FIRST_CLASS("First class", 4), PREMIUM_FIRST("Premium first", 5), BASIC_ECONOMY("Basic economy", 0);

	String text;
	int weight;

	private TraflaFlightClass(String text, int weight) {
		this.text = text;
		this.weight = weight;
	}

}
