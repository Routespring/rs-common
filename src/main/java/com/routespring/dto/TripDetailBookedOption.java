package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TripDetailBookedOption {

	@JsonProperty("detail")
	private List<BookedOption> detail;

	@JsonProperty("calendarUrls")
	private List<NameValueDTO> calendarUrls;

	@JsonProperty("calendarUrl")
	private String calenderUrl;

	@JsonProperty("invoiceUrl")
	private String invoiceUrl;

	@JsonProperty("tripItUrl")
	private String tripItUrl;

	@JsonProperty("transaction")
	private ConfirmTransaction confirmTransaction;

	@JsonProperty("canExpensify")
	private boolean canExpensify;

	private Card cardDetails;
	private String authFormUrl;

}
