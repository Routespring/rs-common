package com.routespring.dto;

import java.util.List;

public class PerDiemPolicy {
	List<PerDiemPolicyItem> items;
	boolean automaticallyReimburse;
	public List<PerDiemPolicyItem> getItems() {
		return items;
	}
	public void setItems(List<PerDiemPolicyItem> items) {
		this.items = items;
	}
	public boolean isAutomaticallyReimburse() {
		return automaticallyReimburse;
	}
	public void setAutomaticallyReimburse(boolean automaticallyReimburse) {
		this.automaticallyReimburse = automaticallyReimburse;
	}
}
