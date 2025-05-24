package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreTypes {
	public static final String SCORETYPE_LABEL_OVERALL = "All";
	public static final String SCORETYPE_LABEL_PRODUCTIVITY = "Productivity";
	public static final String SCORETYPE_LABEL_TIME = "Time";
	public static final String SCORETYPE_LABEL_PRICE = "Price";
	public static final String SCORETYPE_LABEL_COMFORT = "Comfort";

	public static final String SCORETYPE_ID_OVERALL = "overAll";
	public static final String SCORETYPE_ID_PRODUCTIVITY = "scoreByProductivity";
	public static final String SCORETYPE_ID_TIME = "scoreByTime";
	public static final String SCORETYPE_ID_PRICE = "scoreByPrice";
	public static final String SCORETYPE_ID_COMFORT = "scoreByComfort";

	@Getter
	@AllArgsConstructor
	public enum LabelDefinition {
		scoreByProductivity(SCORETYPE_LABEL_PRODUCTIVITY, SCORETYPE_ID_PRODUCTIVITY),
		scoreByPrice(SCORETYPE_LABEL_PRICE, SCORETYPE_ID_PRICE),
		scoreByComfort(SCORETYPE_LABEL_COMFORT, SCORETYPE_ID_COMFORT),
		scoreByTime(SCORETYPE_LABEL_TIME, SCORETYPE_ID_TIME), overAll(SCORETYPE_LABEL_OVERALL, SCORETYPE_ID_OVERALL);

		private String label;
		private String id;

	}

}
