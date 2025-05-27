package com.routespring.dto;

public enum CarClass {
	Mini, EconomyClass("Economy"), Compact, Economy("Mini, Economy or Compact"), Intermediate(), Standard(), Fullsize(),
	Premium(), Luxury(), UnknownClass();

	private String text;

	private CarClass(String text) {
		this.text = text;
	}

	private CarClass() {
		this.text = this.name();
	}

	public String getText() {
		return this.text;
	}

}
