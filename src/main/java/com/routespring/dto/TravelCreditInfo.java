package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TravelCreditInfo {
	private double creditAmount;
	private Double displayCreditAmount;
	private String vendorCode;
	private String vendorReference;
	private String expiry;
	private String gallopReference;
	private String transactionId;
	private String eventId;
	private String optionId;
	private String metaData;
	private String travellerEmail;
	private String currency;
	String creditReferenceType;
	String creditReferenceValue;
	private String handler;
	private boolean isNDCCredit;
	private boolean isPseudoCredit;
	private boolean handledAutomatically;
	String travellerFirstName;
	String travellerLastName;
	int maxResidual = Integer.MAX_VALUE;

}
