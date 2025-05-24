package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class HotelPolicy extends TravelPolicy {
	private List<String> guaranteeType;
	private List<String> paymentType;
	private Double maxHotelRatingAllowed;
	@JsonProperty("checkGSA")
	private boolean checkGSA;
	private boolean restrictNonRefundable;

}
