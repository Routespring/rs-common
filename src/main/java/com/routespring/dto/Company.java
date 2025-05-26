package com.routespring.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.routespring.dto.SubscriptionPlan.SubscriptionId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	@JsonProperty("company_id")
	private int companyId;
	private String emailId;
	private List<ExpenseProviders> allowedExpenseVendors = new ArrayList<>();
	@JsonProperty("subscription")
	private SubscriptionId subscription;
	@JsonProperty("name")
	private String name;
	@JsonProperty("logo")
	private String logo;
	@JsonProperty("allowOnlyForSpecificCarCorporatedId")
	private Boolean allowOnlyForSpecificCarCorporatedId;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("domains")
	private List<CompanyDomain> domains;

	@JsonProperty("discount_code")
	private List<DiscountCode> discountCode;

	private int maxBookingsWithoutServiceFee = 0;
	private int maxBookingsWithDiscount = 0;

	private Discount cashback;
	private Discount companyServiceFee;

	private boolean allowReimburse;
	private boolean demoAccount;
	private boolean filterOutLcc = false;
	private boolean slackEnabled = false;

	@JsonProperty("ms_teams_channel_url")
	private String msTeamsChannelUrl;

	private boolean qboEnabled;

	private Date start;

	@JsonProperty("policy")
	private CompanyPolicy policy;

}
