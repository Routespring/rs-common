package com.routespring.dto;

public enum TicketStatus {
	A("Airport Controlled"), C("Checked In"), F("Flown/Used"), L("Boarded/Lifted"), O("Open"), P("Printed"),
	R("Refunded"), E("Exchanged"), V("Void"), Z("Archived/Carrier Modified"), U("Unavailable"), S("Suspended"),
	I("Irregular Ops"), D("Deleted/Removed"), X("Unknown");

	private String status;

	private TicketStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return this.status;
	}
}
