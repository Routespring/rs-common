package com.routespring.dto;

import lombok.Getter;

@Getter
public enum RateType {
	CorporateRate("Corporate rate"), RegularRate("Regular rate"), NotKnown("-NA-");
	String text;
	private RateType(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return text;
	}
}
