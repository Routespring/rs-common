package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyPolicy {
	public enum PolicyViolationHandling {
		FLAG_OOP, RESTRICT_OOP
	}

	public enum ApprovalRequiredFor {
		ALL_BOOKINGS, OUT_OF_POLICY_BOOKING, NONE
	};

	boolean approvalProcessEnabled = true;
	ApprovalRequiredFor approvalRequiredFor = ApprovalRequiredFor.OUT_OF_POLICY_BOOKING;
	boolean travelPurposeMandatory = false;
	@JsonProperty("flight")
	private FlightPolicy flightPolicy;

	@JsonProperty("internationalFlight")
	private FlightPolicy internationalFlightPolicy;

	@JsonProperty("hotel")
	private HotelPolicy hotelPolicy;
	@JsonProperty("carPolicy")
	private CarPolicy carPolicy;
	@JsonProperty("trainPolicy")
	private TrainPolicy trainPolicy;
	private PerDiemPolicy perDiemPolicy;
	@JsonProperty("considerBasicEconomy")
	private boolean considerBasicEconomy = false;

	private String policyAdminName;

	private String policyAdminEmail;
	private PolicyViolationHandling policyViolationHandling = PolicyViolationHandling.RESTRICT_OOP;
	boolean companyCardAllowed = false;

}
