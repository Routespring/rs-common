package com.routespring.dto.signin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JourneyDateInput {
	String intervalStart;
	String intervalEnd;
	IntervalType intervalType;

	public enum IntervalType {
		ARRIVAL_BASED, DEPARTURE_BASED
	}

}
