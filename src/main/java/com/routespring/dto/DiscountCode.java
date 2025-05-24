package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountCode {

	private Integer id;

	private String partnerName;

	private String partnerCode;
	private String discountCode;

	private String billingNumber;

}
