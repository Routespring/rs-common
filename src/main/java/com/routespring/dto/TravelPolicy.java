package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class TravelPolicy {

	public enum TravelPolicyTypes {
		@JsonProperty("price")
		TRAVEL_POLICY_TYPE_PRICE, @JsonProperty("seat")
		TRAVEL_POLICY_TYPE_CLASS, @JsonProperty("nopolicy")
		TRAVEL_POLICY_TYPE_NOPOILCY, @JsonProperty("checkbox_other_policy_type")
		TRAVEL_POLICY_TYPE_OTHER;
	};

	@JsonProperty("pricePolicyList")
	private List<PricePolicy> pricePolicyList;

}
