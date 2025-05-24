package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeTicketStatus {

	/** Unticketed */
	U("Unticketed"),

	/** Ticketed */
	T("Ticketed"),

	/** Voided */
	V("Voided"),

	/** Refunded */
	R("Refunded"),

	/** Exchanged */
	X("Exchanged"),

	/** Unknown/Archived/Carrier Modified */
	Z("Unknown/Archived/Carrier Modified"),

	/** Unused */
	N("Unused"),

	/** Used */
	S("Used");

	private final String description;

	TypeTicketStatus(String description) {
		this.description = description;
	}

	@JsonValue
	public String value() {
		return name();
	}

	public String getDescription() {
		return description;
	}
}
