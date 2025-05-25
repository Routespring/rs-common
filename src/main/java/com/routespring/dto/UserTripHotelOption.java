package com.routespring.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.routespring.dto.HotelSearchHandler.HotelHandlerType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTripHotelOption {

	@JsonProperty
	private String source;
	@JsonProperty("refundAmount")
	private String refundAmount = "0.0";
	@JsonProperty
	private String link;
	@JsonProperty
	public int optimumPrice;
	@JsonProperty
	private String bookingId;
	@JsonProperty
	private String hotelChain;
	@JsonProperty
	private String hotelCode;
	@JsonProperty
	private String hotelName;
	@JsonProperty
	private Double originalPrice;
	@JsonProperty
	private String hotelChainName;
	@JsonProperty
	private Boolean preferredbrand = false;
	@JsonProperty
	private Date dateOfBooking;
	@JsonProperty
	private TraflaRateDetail hotelRateDetail;
	@JsonProperty
	private Boolean isApprox = false;

	private Double distanceInMilesFromMeeting;
	@JsonProperty
	private Boolean isZipCodeRequired = false;

	private boolean cancellationRequestReceived;

	private String costPrice;

	@JsonProperty
	private List<HotelRoom> hotelRooms;
	private String nonRefundableStayIndicator;

	private HotelImage hotelImages;

	private String displayCurrency;
	private Double displayPrice;
	private Double displayRefundAmount;

	@JsonProperty
	private String boardType;

	@JsonProperty
	private String boardCode;

	@JsonProperty
	private HotelHandlerType handleType;

	@JsonProperty
	private String roomType;

	@JsonProperty("rate_comment_description")
	private List<String> rateCommentDescription;

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
	private List<HotelPhoneNumber> phoneNumber;
	@JsonProperty
	private String currency = "USD";
	@JsonProperty
	private Double minPrice = 0.0;
	@JsonProperty
	private Double maxPrice = 0.0;
	@JsonProperty
	private String latitude;
	@JsonProperty
	private String longitude;
	@JsonProperty
	private Date checkInDate;
	@JsonProperty
	private Date checkOutDate;
	@JsonProperty
	private Integer stay;
	@JsonProperty
	private String roomCode;
	@JsonProperty
	private String rateId;
	@JsonProperty
	private Integer distance;

	@JsonProperty
	private int walkingTime;
	@JsonProperty
	private Boolean inRange = true;
	@JsonProperty
	private Boolean inPolicy = true;

	@JsonProperty
	private Boolean isGreatPrice = false;

	@Deprecated
	@JsonProperty
	private Boolean nonrefundable = false;

	@JsonProperty
	private Boolean prepay = false;
	@JsonProperty
	private List<HotelCancellationTicketInfo> cancellationPolicy;

	@JsonProperty
	private String cancellationConfirmationNumber;

	@JsonProperty
	private String ratingBreakUp;

}
