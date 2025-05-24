package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FareBreakUp {
	double price;
	double tax;
	double totalPrice;
	Double discountedPrice;
	Double displayPrice;
	List<FareBreakUp> passengerTypeWiseBreakup;
}
