package com.routespring.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum HotelStatus {

	INIT("INIT"), ERROR("ERROR"), SUCCESS("SUS"), APIERROR("ERR"), NOTAVAILABLE("NA"), ROOMNOTAVAILABLE("RNA"),
	PRICECHANGE("PRC"), CONFIRMED("CNF"), CANCELLED("CLD"), NEW("NEW"), PRECONFIRMED("PCNF"), TO_BE_CANCELLED("TBC"),
	TO_BE_UPDATED("TBU"), API_ERROR_TRY_AGAIN("TRYA"), FAILED_BY_VENDOR("FBV"), API_ERROR_HANDLED_BY_AGENT("HNBA"),
	PAYMENT_ERROR("PMTE"), REVALIDATESUCCESS("REVALIDATESUCCESS"), ERROR_RETRY("ERROR_RETRY");

	private String value;

	HotelStatus(String value) {
		this.value = value;
	}

}
