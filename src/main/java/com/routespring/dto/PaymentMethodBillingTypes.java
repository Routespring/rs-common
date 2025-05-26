package com.routespring.dto;

public enum PaymentMethodBillingTypes {

	BILL_TO_COMPANY, PERSONAL_CARD;

	public String getValue() {
		if (this.equals(BILL_TO_COMPANY))
			return "billToCompany";
		else if (this.equals(PERSONAL_CARD))
			return "personalCard";
		else
			return "personalCard";
	}

	public static PaymentMethodBillingTypes fromValue(String value) {
		if ("personalCard".equals(value))
			return PaymentMethodBillingTypes.PERSONAL_CARD;
		else if ("billToCompany".equals(value))
			return PaymentMethodBillingTypes.BILL_TO_COMPANY;
		else
			return PaymentMethodBillingTypes.PERSONAL_CARD;
	}

}
