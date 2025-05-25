package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TraflaSeatInfoSelected extends TraflaSeatInfo {
	private String seatNumber;
	private Double price;
	private Object optionalService;
	private String passengerName;
	private TraflaSeatStatusEnum status = TraflaSeatStatusEnum.FLD;
	private String requestedSeatNumber;

}
