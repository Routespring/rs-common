package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StripeCardDTO {

	private String id;
	private String customer;
	private String address_city;
	private String address_country;
	private String address_line1;
	private String address_line1_check;
	private String address_line2;
	private String address_state;
	private String address_zip;
	private String address_zip_check;
	private String brand;
	private String country;
	private String cvc_check;
	private String dynamic_last4;
	private String exp_month;
	private String exp_year;
	private String fingerprint;
	private String funding;
	private String last4;
	private String name;
	private String tokenization_method;

}
