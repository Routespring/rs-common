package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandDetails {
	private String code;
	private String brandId;
	private String name;
	private String description;
	private String fareBasis;
	private Double priceDiff;
	private Double serviceFee;
	private FareAttributes fareAttributes;
	private TraflaAirBaggage baggageAllowance;
	private boolean allowForBooking;
}
