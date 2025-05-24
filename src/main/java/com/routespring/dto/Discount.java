package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Discount {
	@JsonProperty("discount_id")
	private String discountId;

	@JsonProperty("type")
	private DiscountType type;

	@JsonProperty("visibility")
	private Visibility visibility;

	@JsonProperty("description")
	private String description;

	@JsonProperty("percentValue")
	private Double percentValue;

	@JsonProperty("capOnPercentValue")
	private Double capOnPercentValue;

	@JsonProperty("absoluteValue")
	private Double absoluteValue;

	@JsonProperty("name")
	private String name;

	private TypeOfFee typeOfFree;

}
