package com.routespring.dto;

import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//TODO-SUMIT - review

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelRateDetail {

	private String ratePlanType;
	private String approximateBase;
	private String approximateTax;
	private String approximateTotal;
	private String approximateSurcharge;
	private Boolean rateGuaranteed;
	private Boolean approximateRateGuaranteed;
	private BigInteger rateCategory;
	private String key;
	private String rateSupplier;
	private BigInteger bookableQuantity;
	private String rateOfferId;
	private Boolean inPolicy;
	private String base;
	private String tax;
	private String total;
	private String surcharge;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class ExtraCharges {
		private String extraAdultAmount;
		private String extraChildAmount;
		private String cribAmount;
		private String adultRollawayCharge;
		private String childRollawayCharge;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class BedTypes {
		private BigInteger code;
		private BigInteger quantity;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class RoomCapacity {
		private List<BigInteger> capacity;
		private Boolean isPackage;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Inclusions {
		private MealPlans mealPlans;

		@NoArgsConstructor
		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class MealPlans {
			private List<MealPlan> mealPlan;

			@Data
			@NoArgsConstructor
			@AllArgsConstructor
			@JsonInclude(JsonInclude.Include.NON_NULL)
			public static class MealPlan {
				private BigInteger code;
			}
		}
	}
}
