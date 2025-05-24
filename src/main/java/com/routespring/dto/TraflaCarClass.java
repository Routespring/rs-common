package com.routespring.dto;

public enum TraflaCarClass {
	Mini, EconomyClass("Economy"), Compact, Economy("Mini, Economy or Compact"), Intermediate(), Standard(), Fullsize(),
	Premium(), Luxury(), UnknownClass();

	private String text;

	private TraflaCarClass(String text) {
		this.text = text;
	}

	private TraflaCarClass() {
		this.text = this.name();
	}

	public String getText() {
		return this.text;
	}

}
