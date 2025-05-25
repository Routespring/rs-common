package com.routespring.facade.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebSigninReq {
	@JsonProperty("login_email")
	private String loginEmail;
	@JsonProperty("login_password")
	private String loginPassword;
	@JsonProperty("googleAccessToken")
	private String googleAccessToken;
	@JsonProperty("connectionType")
	private String connectionType;
	@JsonProperty("dataConsentAccepted")
	private String dataConsentAccepted;
	@JsonProperty("selectedLanguage")
	private String selectedLanguage;
	@JsonProperty("utm_campaign")
	private String utmCampaign;
	@JsonProperty("platform")
	private String platform;
	@JsonProperty("appBuildNumber")
	private String appBuildNumber;
	@JsonProperty("Referer")
	private String referer;
}
