package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillingInfoDescription {
	BIllingInfoDescTypes type;
	String cardTypeCode;
	String last4;
}
