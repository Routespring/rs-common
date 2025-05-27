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
public class Traveller {
	String title;
	String firstName;
	String lastName;
	String middleName;
	String gender;
	String dateOfBirth;
	String phoneNumber;
	String nationality;
	String address;
	String zipCode;
	String email;
	PassportDetails passportDetails;
	String knownTravellerNumber;
	List<FfnMapping> frequentFlyerInfo;
	List<HotelLoyality> hotelLoyalityInfo;
	List<RentalCarLoyaltyNumber> carLoyalityInfo;
	String profileImage;
	String seat;
	String roomId;
	@JsonProperty("dialCode1")
	String emergencyContactCountryCode;
	@JsonProperty("contactNumber")
	String emergencyContactPhoneNumber;
	@JsonProperty("emergencyContactName")
	String emergencyContactName;
	@JsonProperty("relationship")
	String emergencyContactRelationship;
	PassengerType travellerType = PassengerType.ADULT;

}
