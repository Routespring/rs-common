package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionPlan {

	public enum SubscriptionId {
		subscription_free, subscription_professional, subscription_jetsetter
	};

	@JsonProperty("id")
	private SubscriptionId id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cashback")
	private Cashback cashback = new Cashback();

	@JsonProperty("price")
	private Price price;

}
