package com.routespring.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.routespring.dto.HotelSearchHandler.HotelHandlerType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelInfo extends CommonHotelInfo {

	public int optimumPrice;

	@JsonProperty
	private HotelStatus status = HotelStatus.NEW;
	@JsonProperty
	private String appointmentAddress;

	@JsonProperty
	private Integer prefClass;

	@JsonProperty
	private String gallopId;

	@JsonProperty
	private Boolean isHotelAvailableOnTravelport = false;

	@JsonProperty
	private RateDetail hotelRateDetail;
	private Boolean requestGovtRates;
	private boolean showAAARates = false;
	private List<RateDetail> hotelRateList;

	private Boolean isApprox;

	@JsonProperty
	private Boolean allowedForBooking = false;

	@JsonProperty
	private String approxCurrency;

	public String getApproxCurrency() {
		return approxCurrency;
	}

	public void setApproxCurrency(String approxCurrency) {
		this.approxCurrency = approxCurrency;
	}

	@JsonProperty
	private String universalRecordTravelport;

	public String getUniversalRecordTravelport() {
		return universalRecordTravelport;
	}

	public void setUniversalRecordTravelport(String universalRecordTravelport) {
		this.universalRecordTravelport = universalRecordTravelport;
	}

	@JsonProperty
	private double traflaRating = 0;

	@JsonProperty
	private String hotelDescription;

	@JsonProperty
	private String reservationCode;
	private Map<HotelHandlerType, CommonHotelInfo> handlerToHotelInfoCommon = new HashMap<>();
	private String hotelGDSBookingId;
	@JsonProperty
	private Double effectivePct;
	@JsonProperty
	private String hotelChainName;
	@JsonProperty
	private boolean preferredbrand;
	private Double distanceInMilesFromMeeting;
	private double straightLineDistance;

	@JsonProperty
	private Date dateOfBooking;

	@JsonProperty
	private String propertyId;

	@JsonProperty
	private String hotelOptionId;

	@JsonProperty
	private Boolean isZipCodeRequired = false;

	@JsonProperty
	private Boolean showFLightWhileBooking = false;

	@JsonProperty
	private HotelRewardInfo hotelRewards;

	@JsonProperty
	private List<HotelRoom> hotelRooms;
	private String city;
	private String country;
	private String selectionReason;
	private String postalCode;
	private int upVotes = 0;
	private int downVotes = 0;
	private String costPrice;

	@JsonProperty
	private List<HotelCancellationTicketInfo> cancellationPolicy;
	private List<HotelRateDetail> roomsRateAndDescription;
	private List<Map<String, HotelRuleItem>> roomsRules;

	@JsonProperty
	private boolean prepay;

	@JsonProperty
	private String boardType;

	@JsonProperty
	private String boardCode;

	@JsonProperty
	private HotelHandlerType handleType;

	@JsonProperty
	private String errorMessage;

	@JsonProperty
	private String warningMessage;

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
	private List<HotelPhoneNumber> faxNumber;

	@JsonProperty
	private String currency = "USD";
	@JsonProperty
	private Double minPrice = 0.0;

	private String displayCurrency;
	private Double displayPrice;

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
	private String hotelGroupBookingId;
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
	private Double rateUp;

	@JsonProperty
	private String email;
	@JsonProperty
	private String rateId;
	@JsonProperty
	private String rateType;

	@JsonProperty
	private String bookingId;

	@JsonProperty
	private Integer distance = 0;;

	@JsonProperty
	private int walkingTime;
	@JsonProperty
	private TrafficTimes distanceAirport;
	private List<Boolean> roomPolicyStatus;

	@JsonProperty
	private boolean inRange = true;
	@JsonProperty
	private boolean inPolicy = true;

	private List<OutOfPolicyContext> outOfPolicyReasonList;
	private OutOfPolicyContext hotelOutOfPolicyReason;

	@JsonProperty
	private String distanceUnit;
	@JsonProperty
	private boolean isGreatPrice = false;

	@Deprecated
	@JsonProperty
	private boolean nonrefundable = false;

	@JsonProperty
	private String source;

	private String nonRefundableStayIndicator;

}
