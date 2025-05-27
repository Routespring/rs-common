package com.routespring.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripSessionBookingData {

	ApprovalType bookingType;
	private List<HotelDetailResult> hotels;
	private List<CarInfo> cars;
	private List<FlightResult> flights;
	List<SeatInfoSelected> selectedSeat;
	private HotelSearchQuery hotelSearchQuery;
	private CarSearchQuery carSearchQuery;
	private SearchQuery searchQuery;
	private PaymentDetails paymentDetails;
	private Map<String, String> eventIdAndOptionMap;
	private String tripId;
	private String ticketId;
	private RebookingInfo rebookingInfo;
	private String displayCurrency;
	private Double displayPrice;
	private List<FlightResultList> previousBookingCodes;
	private List<BookedOption> duplicateBooking;

}
