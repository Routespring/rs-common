package com.routespring.dto.signin;
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
//	public String getLoginEmail() {
//		return loginEmail;
//	}
//	public void setLoginEmail(String loginEmail) {
//		this.loginEmail = loginEmail;
//	}
//	public String getLoginPassword() {
//		return loginPassword;
//	}
//	public void setLoginPassword(String loginPassword) {
//		this.loginPassword = loginPassword;
//	}
//	public String getGoogleAccessToken() {
//		return googleAccessToken;
//	}
//	public void setGoogleAccessToken(String googleAccessToken) {
//		this.googleAccessToken = googleAccessToken;
//	}
//	public String getConnectionType() {
//		return connectionType;
//	}
//	public void setConnectionType(String connectionType) {
//		this.connectionType = connectionType;
//	}
//	public String getDataConsentAccepted() {
//		return dataConsentAccepted;
//	}
//	public void setDataConsentAccepted(String dataConsentAccepted) {
//		this.dataConsentAccepted = dataConsentAccepted;
//	}
//	public String getSelectedLanguage() {
//		return selectedLanguage;
//	}
//	public void setSelectedLanguage(String selectedLanguage) {
//		this.selectedLanguage = selectedLanguage;
//	}
//	public String getUtmCampaign() {
//		return utmCampaign;
//	}
//	public void setUtmCampaign(String utmCampaign) {
//		this.utmCampaign = utmCampaign;
//	}
//	public String getPlatform() {
//		return platform;
//	}
//	public void setPlatform(String platform) {
//		this.platform = platform;
//	}
//	public String getAppBuildNumber() {
//		return appBuildNumber;
//	}
//	public void setAppBuildNumber(String appBuildNumber) {
//		this.appBuildNumber = appBuildNumber;
//	}
//	public String getReferer() {
//		return referer;
//	}
//	public void setReferer(String referer) {
//		this.referer = referer;
//	}
//		
}
