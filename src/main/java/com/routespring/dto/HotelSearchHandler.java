package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class HotelSearchHandler {

	@Getter
	@AllArgsConstructor
	public enum HotelHandlerType {
		TravelPort(2, 1), Apiary(3, 3), HotelBeds(1, 2), Expedia(4, 4), PriceLine(0, 0), Demo(5, 5), Sabre(0, 0);

		private int priority; // lower value means higher priority
		private int imagePriority;

	}

}