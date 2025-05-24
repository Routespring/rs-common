package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PricePenaltyDefinition {
	public double sensitivityEconomyBeforeCap;
	public double sensitivityEconomyAfterCap;
	public double sensitivityBusinessBeforeCap;
	public double sensitivityBusinessAfterCap;
	public int minBasePriceEconomyDomestic;
	public int minBasePriceBusinessDomestic;
	public int minBasePriceEconomyInternational;
	public int minBasePriceBusinessInternational;
	public int minBasePricePerLegEconomyInternational;
	public int minBasePricePerLegBusinessInternational;
	public int minBasePricePerLegEconomyDomestic;
	public int minBasePricePerLegBusinessDomestic;
	public double perceivedPriceMultiplierForWithStatus;
	public double perceivedPriceMultiplierForWithoutStatus;
}
