package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirBaggage {
	private String numberOfPieceAllowed;
	private String maxWeightAllowed;
	private String weightUnit;
}