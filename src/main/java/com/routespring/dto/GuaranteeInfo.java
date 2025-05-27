package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuaranteeInfo {
	private String guaranteeType;
	private DepositAmount depositAmount;

}
