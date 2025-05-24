package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelPhoneNumber {

	private String areaCode;
	private String countryCode;
	private String number;
	private String extension;
}
