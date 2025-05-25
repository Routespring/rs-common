package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "legid", "price", "currency", "legs" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTripMultiFlightOption {
	@JsonProperty("legid")
	private String legid = "legid";
	@JsonProperty("price")
	private String price;
	@JsonProperty("discountedPrice")
	private String discountedPrice;
	@JsonProperty("oldPrice")
	private String oldPrice;
	@JsonProperty("oldDiscountedPrice")
	private String oldDiscountedPrice;
	@JsonProperty("source")
	private String source;
	@JsonProperty("refundAmount")
	private String refundAmount = "0.0";
	@JsonProperty("link")
	private String link;
	@JsonProperty("pnr")
	private String pnr;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("serviceFee")
	private String serviceFee;
	@JsonProperty("legs")
	private List<UserTripFlightOption> legs;
	@JsonProperty("baggageAllowance")
	BaggageDetails baggageAllowance;
	@JsonProperty("carryOnAllowance")
	BaggageDetails carryOnAllowance;
	@JsonProperty("lowToFairPrice")
	private Boolean lowToFairPrice = false;
	@JsonProperty("preferredAirline")
	private Boolean preferredAirline = false;
	@JsonProperty("preferredAirport")
	private Boolean preferredAirport = false;
	@JsonProperty("withinPricePolicy")
	private Boolean withinPricePolicy = false;
	@JsonProperty("FareAttributes")
	private FareAttributes fareAttributes;

	private String discountId;
	private String discountName;
	private boolean cancellationRequestReceived;

	private double creditAmount;
	private String creditExpiryDate;
	private String eticketNumber = "";
	private String displayCurrency;
	private Double displayPrice;
	private Double displayRefundAmount;
	private Double displayCreditAmount;
	private double taxes;
	List<FareBreakUp> passengerTypeWiseBreakup;

}
