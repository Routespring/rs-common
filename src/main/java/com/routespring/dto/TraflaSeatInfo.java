package com.routespring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraflaSeatInfo {

	private List<TraflaSeatRows> seat;
	private String passengerType;
	private String airlineName;
	private String airlineCode;
	private String airlineNumber;
	private String passengerName;
	private String group;
	private String origin;
	private String destination;
	private String segmentRef;

}
