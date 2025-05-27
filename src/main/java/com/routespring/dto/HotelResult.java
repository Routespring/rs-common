package com.routespring.dto;

import java.util.Date;
import java.util.Map;
import com.routespring.dto.HotelSearchHandler.HotelHandlerType;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelResult {

	private String optionSelectionReason;
	private Image thumbnailImage;
	private String hotelName;
	private String address;
	private String marketingText;
	private String hotelChainCode;
	private String hotelChainName;
	private double distanceMile;
	private int drivingTime;
	private int walkingTime;
	private double price;
	private String currency;
	private String displayCurrency;
	private Double displayPrice;
	private String starRating;
	private double score;
	private Map<String, HotelAmenity> amenities;
	private boolean withinPolicy;
	private double latitude;
	private double longitude;
	private Date checkInDate;
	private Date checkOutDate;
	private String rateId;
	private String hotelCode;
	private HotelHandlerType handleType;
	private HotelInfo hotelInfo;
	private boolean priceIncludesTaxesAndFees = true;

}
