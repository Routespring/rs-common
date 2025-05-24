package com.routespring.dto;

public class HotelAlgoVariables {
	public int brandPenaltyPointsMultiplierForPreferredHotel = -70;
	public int preferredHotelClass = -1;
	public int bonusOnUpgradeFromFourStarToFiveStar = -10;

	public int bonusOnUpgradeFromThreeStarToFiveStar = -20;
	public int bonusOnUpgradeFromThreeStarToFourStar = -10;

	public int bonusOnUpgradeFromTwoStarToFiveStar = -50;
	public int bonusOnUpgradeFromTwoStarToFourStar = -30;
	public int bonusOnUpgradeFromTwoStarToThreeStar = -10;

	public int penaltyOnDowngradeFromFiveToTwo = 100;
	public int penaltyOnDowngradeFromFiveToThree = 80;
	public int penaltyOnDowngradeFromFiveToFour = 30;

	public int penaltyOnDowngradeFromThreeToTwo = 30;
	public int penaltyOnDowngradeFromFourToThree = 30;
	public int penaltyOnDowngradeFromFourToTwo = 80;

	public double penaltyMultiplerFromOtoMaxCap = 0.5;

	public double variablePenaltyWhenDistanceIsWalking = 0.2;
	public int fixedCabPenalty = 40;
	public double cabMultiplierForLessThan15Min = 2;
	public double cabMultiplierForMoreThan15Min = 4;
	public int minOPrice = -1;

	public double maxCapMultiplerForO = 3;
	public double penaltyPerDollarAfterMaxCap = 2;

}
