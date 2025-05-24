package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeInfo {

	public enum Role {
		ADMIN, DEPT_ADMIN, APPROVER, EMPLOYEE, TRAVEL_MANAGER;

	}

	private String employeeIdentifier;
	private int departmentId;

	private int policyId;

	private int companyId;

	private String userId;

	private String jobTitle;

	private Role role;
	private List<String> columns;

	private boolean companyCardAccess;
	private boolean verified;
	private boolean allowReimburse;
	private String policyViolationFlag;
	private AgentRole agentRole = AgentRole.BOOK_FOR_OTHERS;

	private List<String> approvers;
	private boolean showGovtRates;
	private boolean showAAARates;
	boolean limitedUser;
	private UserSettiings userSetting;
	private String validTill;
	private int employeeId;

}
