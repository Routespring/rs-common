package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TFLuggageOption {
	String originalText;
	String displayText;
	String optionValue;
	String parameterName;
	Double amount;
	String currency;
	Integer bags;
	String totalWeight;
	String numberOfBags;
	boolean isPerPassenger;
	boolean selected = false;
	String leg;

}
