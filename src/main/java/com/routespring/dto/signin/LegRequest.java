package com.routespring.dto.signin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegRequest {
	String origin;
	String destination;
	String originType;
	String destinationType;
	JourneyDateInput journeyDate;

}
