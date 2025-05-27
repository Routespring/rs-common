package com.routespring.dto;

import lombok.Getter;

@Getter
public enum CarStatus {

	INIT("INIT"), ERROR("ERROR"), SUCCESS("SUS"), APIERROR("ERR"), NOTAVAILABLE("NA"), PRICECHANGE("PRC"),
	CONFIRMED("CNF"), CANCELLED("CLD"), NEW("NEW"), PRECONFIRMED("PCNF"), TO_BE_CANCELLED("TBC"), TO_BE_UPDATED("TBU"),
	API_ERROR_TRY_AGAIN("TRYA"), API_ERROR_HANDLED_BY_AGENT("HNBA"), REVALIDATESUCCESS("REVALIDATESUCCESS");

	private String value;

	CarStatus(String value) {
		this.value = value;
	}

}
