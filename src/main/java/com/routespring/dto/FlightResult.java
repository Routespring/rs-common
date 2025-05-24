package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightResult {
	double price;
	String currency;
	String displayCurrency;
	Double displayPrice;
	Double discountedPrice;
	String id;
	FareBreakUp fareBreakup;
	List<FlightLeg> legs;
	Scoring scores;
	boolean isPassportRequired;
	String handlerType;
	FareAttributes fareAttributes;
	List<FlightResult> allUpsellFares;
	List<OtherFarePriceAttributes> otherFarePriceAttributes;
	boolean fareWithAccountCode;
	boolean fareSupportsPersonalCard = true;
	private double serviceFee;
	private boolean zipCodeRequired;
	private List<TravelCreditInfo> travelCreditsInfo = null;
	private List<TFLuggageOption> luggageOptions = null;
	private List<TFLuggageOption> returnLuggageOptions = null;
	private String marketingMessage;
	private List<AdditionalFee> appliedAdditonalFees;
}
