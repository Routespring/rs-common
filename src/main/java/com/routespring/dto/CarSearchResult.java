package com.routespring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarSearchResult {

	ApprovalRequiredFor approvalRequiredFor = ApprovalRequiredFor.OUT_OF_POLICY_BOOKING;
	boolean travelPurposeMandatory = false;

	private List<CarInfo> carInfo;
	private CarError error;
	AddressDTO destination;
	CarPolicy carPolicy;
}
