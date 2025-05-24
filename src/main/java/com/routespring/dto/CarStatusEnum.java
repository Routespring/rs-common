package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CarStatusEnum {
	public static final CarStatusEnum NO_CARS_FOUND = new CarStatusEnum("NO_CARS_FOUND", "No cars found");
	public static final CarStatusEnum DATE_TIME_PAST_ERROR = new CarStatusEnum("DATE_TIME_PAST_ERROR",
			"Pick-up date/time is in the past. Please enter a valid date/time.");
	public static final CarStatusEnum PICK_LOCATION_CLOSED_THIS_DAY = new CarStatusEnum("PICK_LOCATION_CLOSED_THIS_DAY",
			"Pickup location is closed on this day");
	public static final CarStatusEnum RETURN_LOCATION_CLOSED_THIS_DAY = new CarStatusEnum(
			"RETURN_LOCATION_CLOSED_THIS_DAY", "Return location is closed on this day");
	public static final CarStatusEnum PICK_LOCATION_CLOSED_THIS_TIME = new CarStatusEnum(
			"PICK_LOCATION_CLOSED_THIS_TIME", "Pickup location is closed at this time");
	public static final CarStatusEnum RETURN_LOCATION_CLOSED_THIS_TIME = new CarStatusEnum(
			"RETURN_LOCATION_CLOSED_THIS_TIME", "Return location is closed at this time");
	public static final CarStatusEnum LOCATION_CLOSED = new CarStatusEnum("LOCATION_CLOSED",
			"Pickup/Return location is closed at this day/time");

	private String errorCode;
	private String errorMsg;

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class TravelportCarErrorParsed {
		String msg;
		String location;
		String areaGroup;
		String locationId;
		String vendorCode;
		CarStatusEnum errorCode;

	}
}
