package com.routespring.dto.search.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HotelSearchDTO {
	private String destination;
	private String startDateTime;
	private String returnDateTime;
	private String hotelChain;
	private String currentLocation;
	private int totalTravellerCount;
	private String travellerEmail;

	private List<RoomOccupancyDTO> roomOccupancy;
}
