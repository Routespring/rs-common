package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TripSessionBookingRequestBase {

	private String groupTagName;
	private Long existingGroupId;

	private boolean attemptDirectBooking;
	private TravellersData travellerDetails;
	private String expensifyId;
	private boolean addToExpensify;
	private ExpenseProviders expenseProvider;
	private String projectTagId;
	private String noteToAdmin;
	@JsonProperty("group_travel_event_id")
	private String groupTravelEventId;

}
