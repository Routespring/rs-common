package com.routespring.dto.booking.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.routespring.dto.NameValueDTO;
import com.routespring.dto.PaymentDetails;
import com.routespring.dto.TravellersData;
import com.routespring.facade.dto.ResponseTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponseBase {

	String bookingStatusId;
	int nextCallAfter;
	ResponseTypes status;
	List<BookingError> errors = new ArrayList<BookingError>();
	String transactionId;
	boolean transactionMarkedForCancellation;
	Long tripSessionId;
	String tripSessionBookingItemId;
	String bookingId;
	String ticketId;
	String tripId;
	String ticketNumber;
	TravellersData travellerDetails;
	PaymentDetails paymentDetails;
	Map<String, String> eventIdAndOptions = new HashMap<String, String>();
	List<BookingResponseBase> multiBookingResponse;
	List<String> distinctErrors;
	String lastUpdateOn;
	boolean limitedUserCreated;

	public enum AlreadyHandledResponseType {
		AlreadyRejected, AlreadyApproved, AlreadyExpired, AlreadyBooked
	}

	private AlreadyHandledResponseType alreadyHandledResponse;
	List<String> synced;
	List<String> notTried;
	List<String> failed;
	List<NameValueDTO> errorMsgs;

}
