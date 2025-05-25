package com.routespring.dto.booking.response;

public enum BookingErrorTypes {

	ERROR_PAYMENT, ERROR_AVAILABILITY, ERROR_ROOM_UNAVAILABLE, ERROR_FAILED_BY_VENDOR, ERROR_AVAILABILITY_WITHIN_TWOHRS,
	ERROR_PRICE_CHANGE, ERROR_SCHEDULE_CHANGE, ERROR_API, ERROR_INVALID_INPUT, ERROR_INTERNAL, ERROR_TICKETING,
	ERROR_BOOKING_PENDING, ERROR_TRIP_BOOKING_PENDING,
	ERROR_RETRY
	;

	public String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
