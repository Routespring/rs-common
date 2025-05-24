package com.routespring.dto;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelportCancellationInfo {

	private String cancellationPolicy;

	private List<String> text;
	private String nonRefundableStayIndicator;
	private XMLGregorianCalendar cancelDeadline;
	private Boolean taxInclusive;
	private Boolean feeInclusive;
	private String cancelPenaltyAmount;
	private BigInteger numberOfNights;
	private Float cancelPenaltyPercent;
	private String cancelPenaltyPercentAppliesTo;
	private String method;
	private Boolean supported;
	private String url;
	private String offsetTimeUnit;
	private Integer offsetUnitMultiplier;
	private String offsetDropTime;

}
