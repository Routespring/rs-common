package com.routespring.dto;

import java.util.List;

import com.routespring.dto.CarSearchHandler.CarSearchHandlerType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarRequest {
	private String bookingRateKey;
	private String sid;
	private CarSearchHandlerType handler;
	private String stripeId;
	private String paymentType;
	private String ticketNumber;
	private List<DiscountCode> discountCode;
	private boolean allowOnlyForSpecificCarCorporatedId;
	private String emailId;
	private String partnerCode;
	private RentalCarLoyaltyNumber[] rentalCarLoyaltyNumbers;
}
