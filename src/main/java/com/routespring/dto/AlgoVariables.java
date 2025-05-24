package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlgoVariables {
	@JsonIgnore
	private AlgoConstants initialValues;

	public double journeyTimePenaltyMultiplier;
	public int prefAirlineBase1International;
	public int prefAirlineBase2International;
	public int prefAirlineBase1Domestic;
	public int prefAirlineBase2Domestic;
	public double allianceMultiplier;
	public int perHopPenaltyDomestic = 150;
	public int perHopPenaltyInternational = 150;

	public int hdRangeLowerOffsetInHourDomestic = 3;
	public int hdRangeUpperOffsetInHourDomestic = 18;
	public int hdRangeLowerOffsetInHourInternational = 6;
	public int hdRangeUpperOffsetInHourInternational = 21;

	public int haRangeLowerOffsetInHourDomestic = 18;
	public int haRangeUpperOffsetInHourDomestic = 3;
	public int haRangeLowerOffsetInHourInternational = 21;
	public int haRangeUpperOffsetInHourInternational = 6;

	public double meetingLossMultiplierDomestic = 6;
	public double meetingLossMultiplierInternational = 6;

	public int meetingOverlapAllowedOver5KMiles = 720;
	public int meetingOverlapAllowedFor3KTo5KMiles = 240;
	public int meetingOverlapAllowedBelow3KMiles = 120;

	public double relativeWeightForSleepTime = 1.5;
	public double relativeWeightForOfficeTime = 2;
	public double relativeWeightForOfficeTimeOnMeetingDay = 0.5;
	public double relativeWeightForHomeTime = 0.5;

	public double relativeWeightForSleepTime_International = .9;
	public double relativeWeightForOfficeTime_International = .9;
	public double relativeWeightForOfficeTimeOnMeetingDay_International = .9;
	public double relativeWeightForHomeTime_International = .9;
	public int travelCreditAppliedBonus = 0;
	public int IDLE_TIME_ALLEXCEPT_SLEEP_PRODLOSS_PCT = 80;
	public int IDLE_TIME_SLEEP_PRODLOSS_PCT = 20;

	public int preferredAirportBonus = -75;

	public double HD_REACHING_LATE_PENALTY_PER_MINUTE = 2.0;
	public double HD_LEAVING_EARLY_PENALTY_PER_MINUTE2 = 4.0;
	public double hdPenaltyMultiplierForInternational = 1;

	public double HOME_ARRIVAL_LEAVING_EARLY_PENALTY_PER_MINUTE = 2.0;
	public double HOME_ARRIVAL_REACHING_LATE_PENALTY_PER_MINUTE = 4.0;
	public double haPenaltyMultiplierForInternational = 1;

	public int RED_EYE_PENALTY_DOMESTIC = 300;
	public int RED_EYE_PENALTY_INTERNATIONAL = 300;
	public double goingToBedTime = 22.5;
	public double wakeupTime = 5.5;
	private boolean considerBasicEconomy = false;
	public BasicEconomyConfigTypes basicEconomyConfig = BasicEconomyConfigTypes.USER;
	public PricePenaltyDefinition pricePenaltyDef = new PricePenaltyDefinition();
	public HotelAlgoVariables hotelAlgoVars = new HotelAlgoVariables();

	public enum AlgoTypes {
		PODUCTIVITY, LEISURE
	};

	public enum BasicEconomyConfigTypes {
		USER, YES, NO
	}

}
