package com.routespring.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInfo {
	public enum TicketInfoStatus {
		Unticketed, Ticketed, Voided, Refunded, eXchanged, Unknown_Archived_CarrierModified, Unused, Used;
	}

	private BookingStatus ticketStatus;
	private TicketStatus couponInfo;
	private boolean isSuccess;
	private String ticketId;
	private String GDS;
	private List<String> errorMessage = new ArrayList<String>();
	private TicketInfoStatus ticketInfoStatus;

}