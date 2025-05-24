package com.routespring.dto;

public enum TypeOfFee {
	MARKUP("MRKF"), SERVICE("SRVF"), OTHER("OTHR"), DISCOUNT("DISC"), CORP_DISCOUNT("CRPDISCOUNT");

	private String value;

	private TypeOfFee(String fee) {
		this.value = fee;
	}

	public String getValue() {
		return value;
	}
}
