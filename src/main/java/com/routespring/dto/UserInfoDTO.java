package com.routespring.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {

	@JsonProperty("is_corporate_user")
	private boolean isCorporateUser;
	@JsonProperty("user_id")
	private long userId = -1;
	@JsonProperty("exists")
	private boolean exists = false;
	@JsonProperty("email")
	private String email;
	@JsonProperty("expensifyId")
	private String expensifyId;
	@JsonProperty("addToExpensify")
	private boolean addToExpensify;
	@JsonProperty("userEntityData")
	private User userEntity;

	private String profileImageUrl;
	@JsonProperty("known_traveller_number")
	private String knownTravellerNumber;

	@JsonProperty("alt_emails")
	private List<String> altEmails;

	@JsonProperty("phoneNumber")
	private PhoneNumberDTO phoneNumber;

	@JsonProperty("fnameOnReservation")
	private String fnameOnReservation;
	@JsonProperty("lnameOnReservation")
	private String lnameOnReservation;

	private Date created;
	@JsonProperty
	private Integer roomId;

	@JsonProperty
	private String passengerType = "A";

	@JsonProperty("country_code")
	private String countryCode;
	@JsonProperty("is_active")
	private boolean is_active;

	@JsonProperty("date_joined")
	private Date dateJoined;

	@JsonProperty("title")
	private String title;

	@JsonProperty("gender")
	private String gender;
	@JsonProperty("currency")
	private String currency;

	private EmergencyContactDTO emergencyContact;
	private String seatPreference;

	@JsonProperty("zipcode")
	private String zipcode;

	@JsonProperty("firstname")
	private String firstname;

	@JsonProperty("lastname")
	private String lastname;

	@JsonProperty("middlename")
	private String middlename = " ";

	@JsonProperty("dob")
	private String dob;

	@JsonProperty("user_age")
	private Integer userAge;

	@JsonProperty("home")
	private AddressDTO home;

	@JsonProperty("fullName")
	private String fullName;

	@JsonProperty("work")
	private AddressDTO work;

	@JsonProperty("passportDTO")
	private PassportDTO passportDTO;

	@JsonProperty("locale")
	private String locale;
	@JsonProperty("nickname")
	private String nickname;
	@JsonProperty("suffix")
	private String suffix;
	@JsonProperty("traveler_type")
	private String travelerType;
	@JsonProperty("nationality")
	private String nationality;
	@JsonProperty("companyId")
	private int companyId = -1;

	@JsonProperty("companyName")
	private String companyName;

	private RentalCarLoyaltyNumber[] carLoyaltyNumbers;
	private FfnMapping[] ffnMapping;
	private String hotelLoyalityNumber;

	private HotelLoyality[] loyalityCards;

//	private AlgoVariables userAlgoVariables;
//	private AlgoVariables defaultAlgoVariables;
	private String expensifyPartnerUserId = " ";
	private String expensifyPartnerSecret = " ";
	private EmployeeInfo employeeInfo;

}
