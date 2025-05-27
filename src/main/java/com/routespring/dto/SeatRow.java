package com.routespring.dto;

import java.util.List;

import lombok.Data;

@Data
public class SeatRow {
	private String type;
	private String seatCode;
	private String available;
	private Boolean paid;
	private List<String> characteristic;
	private Double price;
	private Object optionalService;

}
