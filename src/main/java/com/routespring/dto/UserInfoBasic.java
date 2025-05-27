package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoBasic {
	String userId;
	String userName;
	int departmentId;
	String dob;
	String employeeIdentifier;
	PassengerType travellerType = PassengerType.ADULT;
	String userRole;

}