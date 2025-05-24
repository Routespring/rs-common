package com.routespring.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.routespring.dto.SearchRequestDTO.TripType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightSearchOptions {

	public enum SabreNDC {
		NON_NDC, NDC, MIXED
	}

	public enum SeatClass {
		ECONOMY, PREMIUM_ECONOMY, BUSINESS, FIRST_CLASS, PREMIUM_FIRST, BASIC_ECONOMY, AS_POLICY;

		public boolean isLuxuryClasss() {
			if (this.equals(SeatClass.BUSINESS) || this.equals(SeatClass.FIRST_CLASS)
					|| this.equals(SeatClass.PREMIUM_FIRST)) {
				return true;
			}
			return false;
		}

	}

	private int adultCount = 1;
	private int childCount = 0;
	private int infantCount = 0;
	private boolean isCombo;
	private SeatClass handlerTypes;
	private SeatClass seatClass = SeatClass.ECONOMY;
	private TripType tripType;
	private String currency;
	private String language;
	private SabreNDC sabreSearchType = SabreNDC.MIXED;
	private boolean searchUnBundledFares = false;
	private boolean southWestResultAllowed = true;
	private List<LegSpecificFlightOption> legSpecificFlightOptions;
	private List<String> filteredAirlines;
	List<String> permittedConnections;
	List<List<FlightHop>> selectedLegs;
	Map<String, List<AirlineAccountCode>> accountCodes;

	public static class LegSpecificFlightOption {
		String origin;
		String destination;
		String carrier;
		String flightNumber;
		String departureTime;
		String arrivalTime;
		ArrayList<String> bookingCodes;
		boolean forceCarrier = true;
		List<String> permittedConnections;

	}

}
