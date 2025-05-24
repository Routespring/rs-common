package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutOfPolicyContext {

	public enum ReasonCode {
		WITHIN_POLICY, PRICE_OVER_ABS_MARKUP, PRICE_OVER_CHEAPEST_ABS_MARKUP, PRICE_OVER_CHEAPEST_PERCENTAGE_MARKUP,
		NONPOLICY_CLASS, POLICY_CLASS_FOR_INTERNATIONAL, POLICY_CLASS_FOR_DURATION, NONPOLICY_TYPE,
		BASIC_ECO_NOT_ALLOWED, NOT_ACCORDING_EVENT_DEF, NON_REFUNDABLE_NOT_ALLOWED
	}

	private ReasonCode reason;
	private ReasonCode withoutCreditReason;
	private Double price;
	private String currency = "USD";
	private String maxAllowedClass;
	private Double allowedAbsPriceOverCheapest;
	private Double allowedPercentagePriceOverCheapest;
	private Double priceOfCheapestFlight;
	private Double maxAllowedPrice;
	private Double displayMaxAllowedPrice;
	private int minFlightDurationForClass;
	private EventType eventType;
	private int legs = 1;
	boolean nonCombo = false;
	private ApprovalRequiredFor approvalRequiredFor = ApprovalRequiredFor.OUT_OF_POLICY_BOOKING;
	private boolean travelPurposeMandatory = false;

}
