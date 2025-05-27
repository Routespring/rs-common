package com.routespring.dto;

import lombok.Getter;

@Getter
public enum SeatStatusEnum {

	PEN("pending"), FLD("failed"), CNF("CNF");

	private String status;

	private SeatStatusEnum(String status) {
		this.status = status;
	}

}
