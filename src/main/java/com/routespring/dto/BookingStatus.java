package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "status" })
public enum BookingStatus {

	INIT("INIT"), NONE("NONE"),

	FAREVALIDATIONSUCESS("FVS"), PRICECHANGED("PC"), PRICECHANGED_UNDER_ALLOWED_CAP("PC"), FARECHANGED("FRCH"),
	SCHEDULE_CHANGED("SDLCH"), NOTAVAILABLE("notavailable"), SEATUNAVAILABLE("seatunavailable"),
	FAREVALIDATIONFAILED("FVF"),

	CONFIRMED("Confirmed"), PENDING("Pending"), PENDING_MYSTIFLY("Pending_Mystifly"), BOOKINGERROR("BK"),

	CANCELLED("CANC"), PAYMENTCOMP("PAYC"), PAYMENTERROR("PAYER"), PAYMENTCARDERROR("PAYCRDER"),

	ORDERTICKETGENERATEDSUCCESFULLY("OTGS"), ORDERTICKETNOTGENERATEDSUCCESSINIMPERSONTION("OTGSIMP"),
	BOOKTICKETEXPIRED("bookTicketExpire"), ORDERTICKETGENERATEDFAILED("OTGF"),

	CANCELL_FAILED("Cancelled_Failed"), ALREADY_CANCELLED("already_cancelled"),
	TICKETINPROGRESSCANNOTCANCELLED("ticketinprogresscannotcancelled"),
	PAYMENTFAILEDAFTERORDERTICKETGENERATEDDUCC("payFailedAftrOrderTicket"), APIERROR("apierror"), VOIDED("Voided"),
	VOIDED_FAILED("voided_failed"),
	ALREADYEXCHANGED("already_exchanged"),
	INPUT_VALIDATION_ERROR("Data Input error"),
	SHOWERRORTOUSER("unable to perform operation on handler")
	;

	@JsonProperty("status")
	private String status;

	private BookingStatus(String status) {
		this.status = status;
	}

	@JsonProperty("status")
	private String getStatus() {
		return status;
	}

}