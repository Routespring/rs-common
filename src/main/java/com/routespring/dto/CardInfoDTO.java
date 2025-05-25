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
public class CardInfoDTO {

	@JsonProperty("id")
	private String id = "";
	@JsonProperty("customer_id")
	private String customerId;
	@JsonProperty("brand")
	private String brand;
	@JsonProperty("exp_month")
	private int expiryMonth;
	@JsonProperty("exp_year")
	private int expiryYear;
	@JsonProperty("last4")
	private String last4Digits = "last4";
	@JsonProperty("name")
	private String cName = "null";
	@JsonProperty("address")
	private AddressDTO address;
	@JsonProperty("selected")
	private boolean selected;
	@JsonProperty("default")
	private boolean defaultCard;

}
