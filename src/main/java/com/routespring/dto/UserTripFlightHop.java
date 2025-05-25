package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "source_id", "from", "to", "starts", "ends", "carrier", "ocarrier", "type", "duration",
		"terminal", "flightNumber", "imageUrl" })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTripFlightHop {
	@JsonProperty("source_id")
	private String sourceId;
	@JsonProperty("id")
	private String id;
	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("starts")
	private String starts;
	@JsonProperty("ends")
	private String ends;
	@JsonProperty("carrier")
	private String carrier;
	@JsonProperty("ocarrier")
	private String ocarrier;
	@JsonProperty("type")
	private String type;
	@JsonProperty("duration")
	private String duration;
	@JsonProperty("terminal")
	private String terminal;
	@JsonProperty("flightNumber")
	private String flightNumber;
	@JsonProperty("imageUrl")
	private String imageUrl;
	@JsonProperty("pnr")
	private String pnr;
	@JsonProperty("seatNo")
	private String seatNo;
	@JsonProperty("avaailabiltyType")
	String avaailabiltyType;
	@JsonProperty("availabilitySource")
	String availabilitySource;
	@JsonProperty("classOfService")
	String classOfService;
	String brandDetail;
	String fareClassName;

	@JsonProperty("isBasicEconomy")
	private Boolean isBasicEconomy = false;
	@JsonProperty("allianceName")
	private String allianceName;
	@JsonProperty("isLcc")
	private Boolean isLcc = false;
	@JsonProperty("fareBasisCode")
	String fareBasisCode;
	@JsonProperty("BookingCode")
	String BookingCode;

}
