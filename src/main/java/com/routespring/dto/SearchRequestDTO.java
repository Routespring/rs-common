package com.routespring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchRequestDTO {
	public static final String DEFAULT_ONE_DAY_TRIP_MEETING_START_TIME1 = "08:00:00";
	public static final String DEFAULT_ONE_DAY_TRIP_MEETING_START_TIME2 = "11:00:00";
	public static final String DEFAULT_ONE_DAY_TRIP_MEETING_END_TIME1 = "15:00:00";
	public static final String DEFAULT_ONE_DAY_TRIP_MEETING_END_TIME2 = "18:00:00";

	public static final String DEFAULT_NON_ONE_DAY_TRIP_MEETING_START_TIME1 = "03:00:01";
	public static final String DEFAULT_NON_ONE_DAY_TRIP_MEETING_START_TIME2 = "23:59:59";
	public static final String DEFAULT_NON_ONE_DAY_TRIP_MEETING_END_TIME1 = "03:00:01";
	public static final String DEFAULT_NON_ONE_DAY_TRIP_MEETING_END_TIME2 = "23:59:59";

	public enum AddressType {
		TYPE_LOCATION("Address"), TYPE_AIRPORT("Airport"), TYPE_GIVEN_AIRPORT_ONLY("Given_Airport_Only");

		String addressType;

		private AddressType(String addressType) {
			this.addressType = addressType;
		}

		public static AddressType fromVal(String val) {
			if (val == null) {
				return TYPE_LOCATION;
			}
			switch (val.toLowerCase()) {
			case "address":
				return TYPE_LOCATION;
			case "airport":
				return TYPE_AIRPORT;
			case "given_airport_only":
				return TYPE_GIVEN_AIRPORT_ONLY;
			}
			return TYPE_LOCATION;
		}

		public boolean isTypeLocation() {
			return this.equals(TYPE_LOCATION);
		}

		
	}

	public enum SeatClass {
		AS_POLICY, BUSINESS, ECONOMY, PREMIUM_ECONOMY, FIRST_CLASS, BASIC_ECONOMY;
	}

	public enum TripType {
		TWO_WAY, ROUND_TRIP, TWO_WAY_ASSUMED, ONE_WAY_OUTGOING, ONE_WAY_INCOMING, OPENJAW, MULTI_CITY, NOT_INTERPRETED,
		ONLY_HOTEL, HOTEL_AND_FLIGHT;
	}

	protected List<LegRequestDTO> legRequests;
	private String startLatLng = null;
	private String endLatLng = null;
	private int durationInSeconds = -1;
	private String providedUnit;
	private double durationConf;
	private TripType tripType = TripType.TWO_WAY;
	private Boolean isCombo = false;
	private String sabreSearchType;
	private boolean endGivenByUser = true;
	private String requestQueryText = "";
	protected SeatClass seatClass = SeatClass.AS_POLICY;
	private int noOfTravelers;
	private int numberOfInfant;
	private int numberOfChildren;
	private String discountType;
	List<String> filteredAirlines;

	List<String> srcFilteredAirports;
	List<String> destFilteredAirports;
	List<List<FlightHop>> selectedLegs;

	private String leg1OriginConf = "-NA-";
	private String leg1DestinationConf = "-NA-";
	private String startTimeConf = "-NA-";
	private String endTimeConf = "-NA-";
	private String msg = "";

}
