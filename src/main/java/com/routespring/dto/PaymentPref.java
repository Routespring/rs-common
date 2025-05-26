package com.routespring.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PaymentPref { // extends DynamoDBTable {

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class PaymentPrefData {
		private PaymentMethodBillingTypes paymentMethod;
		private StripeCardDTO defaultCardDetails;
		private String cardGroupId;
		private AddressDTO address;
		private String addressSelection = "default";

		private Date created;
		private Date updated;

		@JsonProperty("deleted_cards")
		List<String> deletedCards;
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CardListDTO {
		@JsonProperty("card_list")
		List<CardInfoDTO> cardList;
		@JsonProperty("stripe_card")
		CardInfoDTO stripeCard;
		@JsonProperty("paymentMethod")
		PaymentMethodBillingTypes paymentMethod;

	}

}
