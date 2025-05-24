package com.routespring.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserSettiings {
	Set<BookingEmailConfigType> bookingEmailConfig;
	String bookingEmailCustomId;
	SettingChoiceTypes saveGuestUsers;
	String guestUserDepartmentId;
	SettingChoiceTypes minorBookingEnabled;

}
