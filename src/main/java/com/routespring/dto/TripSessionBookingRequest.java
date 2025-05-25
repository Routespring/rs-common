package com.routespring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TripSessionBookingRequest extends TripSessionBookingRequestBase {

	private List<TripSessionBookingData> bookingItems;
	private List<BookedOption> duplicateBooking;

}
