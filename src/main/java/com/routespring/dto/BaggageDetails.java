package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaggageDetails {
	private String numberOfPieceAllowed = "0";
	private String maxWeightAllowed = null;
	private String weightUnit;
	private List<String> baggageInfoText;
	private Boolean isFree;

}
