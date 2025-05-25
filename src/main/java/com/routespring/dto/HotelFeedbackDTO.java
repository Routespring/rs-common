package com.routespring.dto;

import com.routespring.dto.HotelSearchHandler.HotelHandlerType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelFeedbackDTO {
	public enum HotelFeedbackNegativeReasons {
		LOCATION, APP, CHECKIN, CLEANLINESS, SERVICE
	};

	public enum HotelFeedbackTypes {
		UP, DOWN, NONE
	};

	String transactionId;
	String tripId;
	String ticketId;
	String eventId;
	String hotelId;
	HotelHandlerType handle;
	String gallopId;
	HotelFeedbackTypes feedback;
	HotelFeedbackNegativeReasons[] negativeFeedbackReason;
	String comments;

}
