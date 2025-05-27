package com.routespring.dto.booking.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.routespring.dto.Airport;
import com.routespring.dto.BookedOption;
import com.routespring.dto.ConfirmTransaction;
import com.routespring.dto.NameValueDTO;
import com.routespring.dto.TravellersData;
import com.routespring.dto.TripDetailBookedOption;
import com.routespring.dto.UserInfoBasic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "upcoming", "past", "airlineNames", "airports" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingHistoryResponse {

	@JsonProperty("tripItUrl")
	private String tripItUrl;
	@JsonProperty("tripItUrlHotel")
	private String tripItUrlHotel;
	@JsonProperty("itineraryUrl")
	private String itineraryUrl;
	@JsonProperty("invoiceUrl")
	private List<String> invoiceUrl;
	@JsonProperty("calenderUrl")
	private String calenderUrl;
	@JsonProperty("calenderUrlHotel")
	private String calenderUrlHotel;
	@JsonProperty("allowAddToExpensify")
	private boolean allowAddToExpensify;
	private TravellersData travellersData;
	Map<String, String> cabinClassNames = new HashMap<>();

	@JsonProperty("detail")
	private List<BookedOption> detail = null;

	@JsonProperty("tripDetail")
	private List<TripDetailBookedOption> tripDetail;

	@JsonProperty("isTripApprovalPending")
	private Boolean isTripApprovalPending;

	@JsonProperty("upcoming")
	private List<BookedOption> upcoming = null;
	@JsonProperty("past")
	private List<BookedOption> past = null;
	@JsonProperty("airlineNames")
	Map<String, String> airlineNames = new HashMap<String, String>();
	@JsonProperty("airports")
	Map<String, Airport> airports = new HashMap<String, Airport>();

	@JsonProperty("transaction")
	ConfirmTransaction transaction;

	@JsonProperty("employee")
	Map<String, UserInfoBasic> employees = new HashMap<String, UserInfoBasic>();
	@JsonProperty("transactionList")
	private List<ConfirmTransaction> confirmTransaction;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	private List<NameValueDTO> calendarUrls = new ArrayList<>();
}
