package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalCarLoyaltyNumber {
	String rentalCarName;
	String rentalCarCode;
	String rentalCarLoyaltyNumber;

}
