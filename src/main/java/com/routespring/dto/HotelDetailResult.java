package com.routespring.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelDetailResult {

	@JsonProperty
	private Integer prefClass;

	@JsonProperty
	private String universalRecordTravelport;

	@JsonProperty
	private double traflaRating = 0;

	@JsonProperty
	private String hotelDescription;

	@JsonProperty
	private String reservationCode;
	@JsonProperty
	private String hotelChain;
	@JsonProperty
	private String hotelCode;
	@JsonProperty
	private String hotelLocation;
	@JsonProperty
	private String hotelName;
	@JsonProperty
	private Double originalPrice;
	@JsonProperty
	private String hotelChainName;
	@JsonProperty
	private boolean preferredbrand;
	private Double distanceInMilesFromMeeting;
	private Double serviceFee;
	private double straightLineDistance;
	@JsonProperty
	private Double effectivePct;

	@JsonProperty
	private String propertyId;

	@JsonProperty
	private Boolean isZipCodeRequired = false;

	@JsonProperty
	private Boolean showFLightWhileBooking = false;

	@JsonProperty
	private List<HotelRoom> hotelRooms;

	private String selectionReason;

	@JsonProperty
	private List<HotelCancellationTicketInfo> cancellationPolicy;

	@JsonProperty
	private String boardType;

	@JsonProperty
	private String boardCode;

	@JsonProperty
	private HotelDetailResult handleType;

	@JsonProperty
	private String roomType;

	@JsonProperty
	private String supplierName;

	@JsonProperty
	private String supplierVatNumber;

	@JsonProperty("rate_comment_description")
	private List<String> rateCommentDescription;

	private String participationLevel;

	@JsonProperty
	private String reserveRequirement;
	@JsonProperty
	private String address;

	@JsonProperty
	private String rateCommentId;

	@JsonProperty
	private String GDS;
	@JsonProperty
	private Map<String, HotelAmenity> amenities;
	@JsonProperty
	private String rating;
	@JsonProperty
	private String marketingMessage;
	@JsonProperty
	private List<HotelPhoneNumber> phoneNumber;

	@JsonProperty
	private String currency = "USD";

	@JsonProperty
	private Double minPrice = 0.0;
	@JsonProperty
	private Double maxPrice = 0.0;
	@JsonProperty
	private Boolean isMinPriceChange;
	@JsonProperty
	private Boolean isMaxPriceChange;
	@JsonProperty
	private String latitude;
	@JsonProperty
	private String longitude;
	@JsonProperty
	private String paymentType;
	@JsonProperty
	private Date checkInDate;
	@JsonProperty
	private Date checkOutDate;
	@JsonProperty
	private Integer stay;
	@JsonProperty
	private String roomCode;
	@JsonProperty
	private TraflaRateDetail hotelRateDetail;

	@JsonProperty
	private Double rateUp;
	@JsonProperty
	private String email;
	@JsonProperty
	private String rateId;
	@JsonProperty
	private String rateType;

	@JsonProperty
	private Integer distance;

	@JsonProperty
	private int walkingTime;

	@JsonProperty
	private boolean inRange = true;
	@JsonProperty
	private boolean inPolicy = true;

	private List<OutOfPolicyContext> outOfPolicyReasonList;
	private OutOfPolicyContext hotelOutOfPolicyReason;

	private String displayCurrency;
	private Double displayPrice;

	@JsonProperty
	private String distanceUnit;
	@JsonProperty
	private boolean isGreatPrice = false;
	@Deprecated
	@JsonProperty
	private boolean nonrefundable = false;

	private String nonRefundableStayIndicator;
	@JsonProperty
	private String source;

	private boolean prepay;

}
