package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scoring {

	@JsonProperty(ScoreTypes.SCORETYPE_ID_PRODUCTIVITY)
	Double scoreByProductivity;
	@JsonProperty(ScoreTypes.SCORETYPE_ID_PRICE)
	Double scoreByPrice;
	@JsonProperty(ScoreTypes.SCORETYPE_ID_COMFORT)
	Double scoreByComfort;
	@JsonProperty(ScoreTypes.SCORETYPE_ID_TIME)
	Double scoreByTime;
	@JsonProperty(ScoreTypes.SCORETYPE_ID_OVERALL)
	Double overAll;

}
