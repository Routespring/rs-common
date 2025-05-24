package com.routespring.dto;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchResultSummary {
	HashMap<TraflaFlightClass, Double> minPrices;
}
