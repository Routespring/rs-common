package com.routespring.dto.search.response;

import java.util.List;

import com.routespring.dto.AddressDTO;
import com.routespring.dto.ApprovalRequiredFor;
import com.routespring.dto.CarError;
import com.routespring.dto.CarInfo;
import com.routespring.dto.CarPolicy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarSearchResults {

	ApprovalRequiredFor approvalRequiredFor = ApprovalRequiredFor.OUT_OF_POLICY_BOOKING;
	boolean travelPurposeMandatory = false;

	private List<CarInfo> carInfo;
	private CarError error;
	AddressDTO destination;
	CarPolicy carPolicy;
}
