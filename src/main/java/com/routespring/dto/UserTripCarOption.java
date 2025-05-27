package com.routespring.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.routespring.dto.CarSearchHandler.CarSearchHandlerType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTripCarOption {
	@JsonProperty
	private String description;
	@JsonProperty
	private String traflaVehicleCode;
	private CarClass carClass;
	private CarType carType;

	@JsonProperty
	private String passengers;
	@JsonProperty
	private String doors;
	@JsonProperty
	private String bags;

	@JsonProperty
	private String billingNumber;

	@JsonProperty
	private String corpDiscountCode;

	@JsonProperty
	private Boolean automaticTransmission = false;
	@JsonProperty
	private Boolean airConditioning = false;
	@JsonProperty
	private Map<String, String> images;
	@JsonProperty
	private String pickUpLocation;
	@JsonProperty
	private String dropOffLocation;
	@JsonProperty
	private String partnerLogo;
	@JsonProperty
	private String partnerName;
	@JsonProperty
	private String traflaPartnerCode;
	@JsonProperty
	private String rateKey;
	@JsonProperty
	private Boolean postPay = false;
	@JsonProperty
	private Boolean milage = false;
	@JsonProperty
	private CarSearchHandlerType handlerType;
	@JsonProperty
	private String currency;
	@JsonProperty
	private Double price;
	@JsonProperty
	private Double refundAmount = 0.0;
	private Double displayRefundAmount;
	@JsonProperty
	private Double basePrice;
	@JsonProperty
	private Boolean cardRequired = false;
	@JsonProperty
	private CarStatus status = CarStatus.NEW;
	@JsonProperty
	private String carMake;
	@JsonProperty
	private String locationInformation;
	@JsonProperty
	private String pickUpDate;
	@JsonProperty
	private Boolean policy = false;
	@JsonProperty
	private String distance;
	private String dropDistance;
	@JsonProperty
	private String dropOffDate;
	@JsonProperty
	private Double serviceFee = 0.0;
	private double taxes;
	@JsonProperty
	private Integer numberOfDay;

	@JsonProperty
	private String dateOfBooking;

	@JsonProperty
	private Boolean paymentRequired = false;

	@JsonProperty
	private String carGDSBookingId;
	PhoneNumberDTO phoneNumber;
	PhoneNumberDTO pickUpLocationPhoneNumber;
	PhoneNumberDTO dropLocationPhoneNumber;
	Boolean zipCodeRequired = false;
	private String pickupDateTimeISO;
	private String dropOffDateTimeISO;
	private boolean cancellationRequestReceived;

	@JsonProperty
	private String displayCurrency;
	@JsonProperty
	private Double displayPrice;
	private Double displayBasePrice;
	private FuelType fuelType;
	@JsonProperty
	private String pickUpLocationType;
	@JsonProperty
	private String dropLocationType;

	@JsonProperty
	private String pickUpTime;

	@JsonProperty
	private String dropOffTime;

	@JsonProperty
	private String source;
	@JsonProperty
	private String link;

	@JsonProperty
	private String bookingId;

}
