package com.routespring.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	@JsonProperty("google_info")
	private String googleInfo;

	@JsonProperty("userid")
	private String userId;

	@JsonProperty("ga_client_id")
	private String gaClientId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("user_role")
	String userRole;

	@JsonProperty("service_fee")
	private Discount serviceFee;

	@JsonProperty("companyCardAccess")
	String companyCardAccess;

	@JsonProperty("companyId")
	String companyId;

	@JsonProperty("uuid")
	private int uuid = -1;

	boolean isTestUser;

	private Date lastLogin;

	@JsonProperty("subscription")
	Subscription subscription;

	@JsonProperty("emailVerified")
	private Boolean emailVerified;

}
