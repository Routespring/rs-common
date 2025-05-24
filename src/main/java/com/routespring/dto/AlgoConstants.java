package com.routespring.dto;

public class AlgoConstants {

	public static int SOFT_LAYOVER_CUTOFF_DOMESTIC = 45;
	public static int HARD_LAYOVER_CUTOFF_DOMESTIC = 30;
	public static int SOFT_LAYOVER_CUTOFF_INTERNATIONAL = 90;
	public static int HARD_LAYOVER_CUTOFF_INTERNATIONAL = 50;
	public static int MILES_THREASHOLD_FOR_ASSUMING_HOME_OFFICE = 10;
	public static int REJECTION_PENALTY = 1000000;
	public static int GET_READY_TO_SLEEP_TIME = 15;
	public static int GET_READY_AFTER_SLEEP = 30;
	public static int CAB_WAITING_TIME = 15;
	public static int CHECKIN_TIME = 35;
	public static int BOARDING_TIME = 20;
	public static int FLIGHT_SETTLING_TIME = 15;
	public static int FLIGHT_LANDING_AND_TAXI_TIME = 15;
	public static int FLIGHT_EXIT_TIME = 5;
	public static int AIRPORT_EXIT_TIME = 5;
	public static int CAB_WAITING_TIME_OTHER = 15;
	public static int PRE_MEETING_BUFFER = 0;
	public static int CAB_WAITING_FOR_RENTAL = 45;
	public static int RENTAL_DISTANCE_CUTOFF = 0;
	public static Integer DEFAULT_TRAFFIC_TIME_TO_MEETING_FROM_AIRPORT = 45;
	public static int DEFAULT_TRAFFIC_TIME_TO_AIRPORT_FROM_START = 45;
	public static int DEFAULT_TRAFFIC_TIME_FOR_INTERNATIONAL = 60;
	public static int ADDITIONAL_TIME_FOR_INTERNATIONAL = 60;
	public static double REACHING_LATE_GRACE_PERIOD_PENALTY_PER_MINUTE = 0.2;
	public static double LEAVING_EARLY_PENALTY_PER_MINUTE1 = 3.0;
	public static double LEAVING_EARLY_GRACE_PERIOD_PENALTY_PER_MINUTE = 0.5;

	public double HOME_ARRIVAL_REACHING_LATE_GRACE_PERIOD_PENALTY_PER_MINUTE = 2.0;
	public static double HOME_ARRIVAL_LEAVING_EARLY_GRACE_PERIOD_PENALTY_PER_MINUTE = 0.3;
	public static int HOME_ARRIVAL_LEAVING_EARLY_GRACE_PERIOD = 120;

	public static int ADDITIONAL_CROSSBORDER_CABTIME = 60; // 60 minites

	public int NOT_PREF_AIRLINE_PENALTY = 200;

	protected int nonPreferredAirportPenalty = 75;
	protected int sameDayHotelCheckinCutoffOffset = 28 * 60; // (4 AM --> 28 Hours)

	public static int RED_EYE_CUTOFF_OFFSET = 180; // 3AM
	public static String RED_EYE_CUTOFF_TIME = "03:00:00"; // 3AM
	public static int JOURNEY_DURATION_FOR_RED_EYE = 240; // 4 hours
	public static int MINIMUM_LAYOVER_CUTOFF = 30;
	public static int ODD_TIME_CUTOFF_START = 23;
	public static int ODD_TIME_CUTOFF_END = 6;
	public static double ALLIANCE_MULTIPLER = 0.8;
	public static double PERCEIVED_PRICE_MULTIPLIER_FOR_WITH_STATUS = 0.2;
	public static double PERCEIVED_PRICE_MULTIPLIER_FOR_WITHOUT_STATUS = 0.1;

	public static int MAX_REACHING_ODDTIME_PENALTY = 150;
	public static double reachingOddTimeMultiplier = 0.6;

	protected double journeyTimePenaltyMultiplier = 0.5;

	protected double cabUnPredictabilityWieght = 2.0;

	protected int PREF_AIRLINE_CONST1_DOMESTIC = 100;
	protected int PREF_AIRLINE_CONST2_DOMESTIC = 50;
	protected int PREF_AIRLINE_CONST1_INTERNATIONAL = 200;
	protected int PREF_AIRLINE_CONST2_INTERNATIONAL = 100;
	protected int PREF_AIRLINE_CONST3 = 33;

	public static double sensitivityEconomyBeforeCap = 0.3;
	public static double sensitivityEconomyAfterCap = 0.9;
	public static double sensitivityBusinessBeforeCap = 0.1;
	public static double sensitivityBusinessAfterCap = 0.3;

	public static int minBasePriceEconomyDomestic = 0; // 300;
	public static int minBasePriceBusinessDomestic = 0; // 900;
	public static int minBasePriceEconomyInternational = 0; // 750;
	public static int minBasePriceBusinessInternational = 0; // 2000;
	public static int minBasePricePerLegEconomyInternational = 0; // 500;
	public static int minBasePricePerLegEconomyDomestic = 0; // 200;
	public static int minBasePricePerLegBusinessInternational = 0; // 1000;
	public static int minBasePricePerLegBusinessDomestic = 0; // 600;

	public static int TOTAL_RESULTS_TO_CONSIDER_FOR_BASE_PRICE = 5;
	public static double MULTIPLIER_FOR_BASEPRICE = 1; // 1.2;
	public static int TIME_RANGE_FOR_CHEAPEST_FLIGHT = 3; // 3 Hours
	public static int TIME_RANGE_FOR_CHEAPEST_FLIGHT_INTERNATIONAL = 10; // 3 Hours

}
