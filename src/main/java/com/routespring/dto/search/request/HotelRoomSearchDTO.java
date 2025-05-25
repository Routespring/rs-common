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
public class HotelRoomSearchDTO {
	private String rate_id;
	private String hotel_code;
	private String check_in_date;
	private String check_out_date;
	private String isRetry;
	private List<RoomOccupancyDTO> travellerData;

	private String price;
	private String hotel_chain;
	private String currency;
	private String optimumPrice;
	private String inPolicy;

	private HotelSearchDTO hotelSearchRequest;
}
