package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FareAttributes {
	FareAttributesIndicator checkedBag = FareAttributesIndicator.NOTFOUND;
	FareAttributesIndicator carryBag = FareAttributesIndicator.NOTFOUND;
	FareAttributesIndicator rebooking = FareAttributesIndicator.NOTFOUND;
	FareAttributesIndicator refund = FareAttributesIndicator.NOTFOUND;
	FareAttributesIndicator seat = FareAttributesIndicator.NOTFOUND;
	FareAttributesIndicator meal = FareAttributesIndicator.NOTFOUND;
	FareAttributesIndicator wifi = FareAttributesIndicator.NOTFOUND;
	FareAttributesIndicator legRoom = FareAttributesIndicator.NOTFOUND;

}
