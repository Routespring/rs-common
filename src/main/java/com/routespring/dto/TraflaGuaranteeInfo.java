package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraflaGuaranteeInfo {
	private String guaranteeType;
	private TraflaDepositAmount depositAmount;

}
