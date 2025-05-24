package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PricePolicy {

	public enum PricePolicyType {
		@JsonProperty("markup")
		MARKUP, @JsonProperty("markup_over_cheapest")
		MARKUP_OVER_CHEAPEST, @JsonProperty("percent_markup_over_cheapest")
		PERCENT_MARKUP_OVER_CHEAPEST, @JsonProperty("checkbox_other_price_policy")
		OTHER,

	}

	private PricePolicyType type;
	private String description;
	private float benchMark;

}
