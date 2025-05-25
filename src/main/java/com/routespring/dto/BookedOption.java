
package com.routespring.dto;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ticketid", "tripid", "type", "eventId", "option" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookedOption {

	@JsonProperty("userid")
	private String userid;
	@JsonProperty("ticketid")
	private String ticketid;
	@JsonProperty("ticketnumber")
	private String ticketnumber;
	@JsonProperty("tripid")
	private String tripid;
	@JsonProperty("type")
	private String type;
	@JsonProperty("eventId")
	private String eventId;
	@JsonProperty("tripStatus")
	private String tripStatus;
	@JsonProperty("bookingDate")
	private String bookingDate;
	@JsonProperty("billingType")
	private String billingType;
	@JsonProperty("destinationCity")
	private String destinationCity;
	@JsonProperty("option")
	private UserTripEventOption option;
	@JsonProperty("transactionType")
	private String transactionType;

	@JsonProperty("transactionId")
	private String transactionId;
	private String location;
	private UserInfoBasic primaryTraveller;
	private List<UserInfoBasic> allTravellers;
	private Feedback feedback = null;
	private String bookedOptionId;
	private String companyId = null;
	private String projectTagId;
	private String bookedBy;
	private String multiBookingId;
	private String modifiedBy;
	private String approvedBy;
	private String rateType;
	private String travelDays;
	private String noteToAdmin;
	private Double bookingFee;
	private BillingInfoDescription billingInfoDescription;
	private HashMap<Integer, Integer> tagsMap;
	boolean guest;
	private String adjustmentType;
	private String adjustmentNote;
	private String adjAttachmentUrl;
	private int passengerCount = 1;
	@JsonProperty("tripSessionId")
	private Long tripSessionId;

	@JsonProperty("tripSessionName")
	private String tripSessionName;
	private String groupTravelEventName;
	private String groupTravelEventId;
	private String policyDetails;

}
