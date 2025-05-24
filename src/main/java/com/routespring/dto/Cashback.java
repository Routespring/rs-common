package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cashback {
	public enum CashbackType {
		percent, absolute
	};

	CashbackType cashbackType = CashbackType.absolute;
	double amount;

	public CashbackType getCashbackType() {
		return cashbackType;
	}

	public void setCashbackType(CashbackType cashbackType) {
		this.cashbackType = cashbackType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
