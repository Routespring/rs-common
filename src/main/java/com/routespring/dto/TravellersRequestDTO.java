package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravellersRequestDTO {

	@JsonProperty
	private int numberOfChildren;
	@JsonProperty
	private int numberOfTraveller;
	@JsonProperty
	private int[] childrenAges;
	@JsonProperty
	private int room;

}
