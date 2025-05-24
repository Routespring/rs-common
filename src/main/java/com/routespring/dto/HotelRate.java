package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRate {

	private String hotelRateId;
	private String hotelRateType;
	private String boardCode;
	private String boardName;
	private Double price;
	private String commentId;
	private List<HotelCancellationTicketInfo> cancellationPolicies;
	private String paymentType;
	private RoomOccupancyDTO roomOccupancyDTO;
	private List<UserInfoDTO> paxes;

}
