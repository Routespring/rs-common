package com.routespring.facade.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "success", "error", "data" })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ServerResponse<T> {

	String userid;
	String userRole;

	@JsonProperty("errors")
	private List<Error> error = new ArrayList<>();

	@JsonProperty("success")
	private boolean success;

	@JsonProperty("error_code")
	private String errorCode;

	@JsonProperty("error_message")
	private String errorMessage;

	@JsonProperty("policySet")
	private boolean policySet;

	@JsonProperty("data")
	private T data;

	private String nextStop;

}
