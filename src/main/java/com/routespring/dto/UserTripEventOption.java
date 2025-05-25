package com.routespring.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.routespring.dto.UserTripsTable.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "option_id", "flight_option", "hotel_option" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTripEventOption {

	@JsonProperty("id")
	private String optionId;
	@JsonProperty("selected")
	private Boolean selected = false;
	@JsonProperty("expensified")
	private Boolean expensified = false;
	@JsonProperty("status")
	private Status status = Status.draft;
	@JsonProperty("flight_option")
	private UserTripMultiFlightOption flightOption;
	@JsonProperty("hotel_option")
	private UserTripHotelOption hotelOption;
	@JsonProperty("car_option")
	private UserTripCarOption carOption;

	@JsonProperty("selectTransId")
	private String selectTransId;

	@JsonProperty
	private Date dateOfBooking;
	private Date approvalExpiryTime;
	private RateType rateType = RateType.NotKnown;

}
