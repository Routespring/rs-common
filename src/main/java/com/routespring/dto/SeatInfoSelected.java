package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SeatInfoSelected extends SeatInfo {
	private String seatNumber;
	private Double price;
	private Object optionalService;
	private String passengerName;
	private SeatStatusEnum status = SeatStatusEnum.FLD;
	private String requestedSeatNumber;

}
