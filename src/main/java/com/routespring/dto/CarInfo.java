package com.routespring.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.routespring.dto.CarSearchHandler.CarSearchHandlerType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarInfo {
	FuelType fuelType;
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
	private Boolean automaticTransmission;
	@JsonProperty
	private Boolean airConditioning;
	@JsonProperty
	private Map<String, String> images;

	@JsonProperty
	private Map<String, String> allowedCard;

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
	private Boolean postPay;
	@JsonProperty
	private Boolean milage;
	@JsonProperty
	private CarSearchHandlerType handlerType;
	@JsonProperty
	private String currency;
	@JsonProperty
	private Double price;
	@JsonProperty
	private Double basePrice;

	private String displayCurrency;
	private Double displayPrice;
	private Double displayBasePrice;

	@JsonProperty
	private boolean paymentRequired;
	@JsonProperty
	private CarStatus status = CarStatus.NEW;
	@JsonProperty
	private String carMake;
	@JsonProperty
	private String locationInformation;
	@JsonProperty
	private String pickUpLocationType;
	@JsonProperty
	private String dropLocationType;
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
	@JsonProperty
	private String selectionReason;
	@JsonProperty
	private Boolean allowedForBooking = false;

	@JsonProperty
	private String source;
	@JsonProperty
	private String bookingId;
	@JsonProperty
	private Integer numberOfDay;

	@JsonProperty
	private String billingNumber;

	@JsonProperty
	private String corpDiscountCode;

	@JsonProperty
	private String optionId;
	@JsonProperty
	private String eventId;

	@JsonProperty
	private Boolean freeCancellation;

	@JsonProperty
	private String pickUpTime;
	@JsonProperty
	private String dropOffTime;

	@JsonProperty
	private Boolean isPolicySet = false;

	@JsonProperty
	private OutOfPolicyContext outOfPolicyReason;
	@JsonProperty
	private String locatorCode;

	@JsonProperty
	private String carGDSBookingId;

	@JsonProperty
	private List<AdditionalFee> appliedAdditonalFees;

	@JsonIgnore
	private String errorMessage;

	PhoneNumberDTO phoneNumber;
	PhoneNumberDTO pickUpLocationPhoneNumber;
	PhoneNumberDTO dropLocationPhoneNumber;
	String pickupLocationTitle;
	String dropLocationTitle;
	boolean zipCodeRequired;

}
