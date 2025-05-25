package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelSearchQuery {

	private String checkInDate;
	private String checkOutDate;
	private String destination;
	private TravellersRequestDTO[] travellerRooms;
	private int totalTravellers;
	private String hotelChain;

}