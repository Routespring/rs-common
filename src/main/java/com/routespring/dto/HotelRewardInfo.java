package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRewardInfo {
	private String hotelChainCode;
	private String hotelName;
	private String loyalityNumber;
	private String label;

}
