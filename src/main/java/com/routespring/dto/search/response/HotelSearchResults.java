package com.routespring.dto.search.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.routespring.dto.AddressDTO;
import com.routespring.dto.ApprovalRequiredFor;
import com.routespring.dto.HotelPolicy;
import com.routespring.dto.HotelResult;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelSearchResults {
	ApprovalRequiredFor approvalRequiredFor = ApprovalRequiredFor.OUT_OF_POLICY_BOOKING;
	boolean travelPurposeMandatory = false;

	List<String> preferredHotelChains = new ArrayList<>();
	List<String> otherHotelChains = new ArrayList<>();
	AddressDTO destination;
	private String optimumPrice;
	List<HotelResult> hotelsList = new ArrayList<>();
	HotelPolicy hotelPolicy;
	boolean isPolicySet = false;

}
