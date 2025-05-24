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
public class OtherFarePriceAttributes {
	double price;
	String currency;
	String displayCurrency;
	Double displayPrice;
	Double discountedPrice;
	String id;
	FareBreakUp fareBreakup;
	FareAttributes fareAttributes;
	List<FlightLeg> legs;
	int ngsStars = -1;
	boolean fareWithAccountCode;
	String handlerType;
	private List<AdditionalFee> appliedAdditonalFees;
}
