package com.routespring.dto;

import java.util.HashMap;
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
public class TraflaRateDetail {

	private String paymentType;
	private Integer allotment;
	private String rateType;
	private String ratePlanType;
	private String ratePlanTypePPN;
	private String approximateBase;
	private String approximateTax;
	private String approximateTotal;
	private String base;
	private String tax;
	private String total;
	private String boardType;
	private String resortFee;
	private String fee;
	private String nightPrice;
	private List<PolicyInfo> policy;
	private List<AdditionalFee> appliedAdditonalFees;
	Double displayTotal;
	Double displayTax;
	Double displayBase;
	Double displayResortFee;
	boolean corporateRate;
	boolean loyaltyNumberMandatory;
	double rsRank;
	private List<CorporateDiscountID> corporateDiscountID;

	private Map<String, String> allowedCredit = new HashMap<>();
	private String hotelCDetails;

	private boolean loyaltyPointsSupported = false;

	@JsonProperty
	private Boolean isZipCodeRequired = false;

	private String nonRefundableStayIndicator;
	private HotelHandlerType handleType;

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	private Double serviceFee = 0.0;

	private List<TraflaHotelRateDescription> roomRateDescription;
	private boolean prePay = true;
	private TravelportCancellationInfo cancelInfo;
	private TraflaGuaranteeInfo guaranteeInfo;

}
