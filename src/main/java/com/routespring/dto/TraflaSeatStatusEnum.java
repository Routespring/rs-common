package com.routespring.dto;

import lombok.Getter;

@Getter
public enum TraflaSeatStatusEnum {

	PEN("pending"), FLD("failed"), CNF("CNF");

	private String status;

	private TraflaSeatStatusEnum(String status) {
		this.status = status;
	}

}
