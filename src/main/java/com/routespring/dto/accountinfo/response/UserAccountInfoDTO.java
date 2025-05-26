package com.routespring.dto.accountinfo.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import in.trafla.dynamoDB.Company;
import in.trafla.dynamoDB.PaymentPref.CardListDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAccountInfoDTO {
	public enum SeatPrefDTO {
		WINDOW("2"), AISLE("1"), NO_PREF("3");
		String seatPreferenceNumeric="3";
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

	public UserInfoDTO getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

	public GallopCashDTO getGallopCash() {
		return gallopCash;
	}

	public void setGallopCash(GallopCashDTO gallopCash) {
		this.gallopCash = gallopCash;
	}

	public CardListDTO getCardList() {
		return cardList;
	}

	public void setCardList(CardListDTO cardList) {
		this.cardList = cardList;
	}

	public SeatPrefDTO getSeatPref() {
		return seatPref;
	}

	public void setSeatPref(SeatPrefDTO seatPref) {
		this.seatPref = seatPref;
	}

	public CardListDTO getCardsModifiedByStripe() {
		return cardsModifiedByStripe;
	}

	public void setCardsModifiedByStripe(CardListDTO cardsModifiedByStripe) {
		this.cardsModifiedByStripe = cardsModifiedByStripe;
	}

	public Company getCompanySettings() {
		return companySettings;
	}

	public void setCompanySettings(Company companySettings) {
		this.companySettings = companySettings;
	}

	public Boolean getConnectedToSlack() {
		return connectedToSlack;
	}

	public void setConnectedToSlack(Boolean connectedToSlack) {
		this.connectedToSlack = connectedToSlack;
	}
}
