package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlineAccountCode {
	String accoutnCode;
	String airlineCode;
	boolean personalCardAllowed = true;
	int departementId = -1;
}
