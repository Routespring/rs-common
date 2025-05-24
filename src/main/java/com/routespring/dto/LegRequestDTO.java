package com.routespring.dto;

import com.routespring.dto.SearchRequestDTO.AddressType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegRequestDTO {

	protected String origin;
	protected String destination;

	protected String dateTime; // yyyy-mm-dd hh:mm:00
	protected String dateTime2;

	protected AddressType originType;
	protected AddressType destinType;

}
