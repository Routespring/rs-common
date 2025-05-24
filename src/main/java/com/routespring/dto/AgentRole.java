package com.routespring.dto;

public enum AgentRole {
	BOOK_FOR_SELF, BOOK_FOR_OTHERS;

	public static AgentRole fromString(String agentRole) {
		if (BOOK_FOR_SELF.name().equalsIgnoreCase(agentRole)) {
			return BOOK_FOR_SELF;
		}
		return BOOK_FOR_OTHERS;
	}
}
