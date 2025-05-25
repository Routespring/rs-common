package com.routespring.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravellersData {
	ArrayList<Traveller> travellers;
	String email;
	String phoneNumber;
	EmergencyContactDTO emergencyContact;
}
