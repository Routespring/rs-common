package com.routespring.dto.accountinfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.routespring.dto.Company;
import com.routespring.dto.GallopCashDTO;
import com.routespring.dto.PaymentPref.CardListDTO;
import com.routespring.dto.UserInfoDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountInfoDTO {
	public enum SeatPrefDTO {
		WINDOW("2"), AISLE("1"), NO_PREF("3");

		String seatPreferenceNumeric = "3";

		private SeatPrefDTO(String pref) {
			this.seatPreferenceNumeric = pref;
		}

		public static SeatPrefDTO getFromSeatPref(String pref) {
			if (pref != null) {
				if (pref.trim().equals("1"))
					return AISLE;
				else if (pref.trim().equals("2"))
					return WINDOW;
				else if (pref.trim().equals("3"))
					return NO_PREF;
				else
					return null;
			} else {
				return null;
			}
		}

		public String getSeatPreference2() {
			return this.seatPreferenceNumeric;
		}
	}

	private UserInfoDTO userInfo;
	private GallopCashDTO gallopCash;
	private CardListDTO cardList;
	private SeatPrefDTO seatPref;
	private CardListDTO cardsModifiedByStripe;
	private Company companySettings;
	private Boolean connectedToSlack;

}
