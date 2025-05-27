package com.routespring.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConfirmTransaction {

	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	public static class TransactionEvent {
		@JsonProperty("event_id")
		private String eventId;

		@JsonProperty("option_id")
		private String optionId;

		@JsonProperty("event_type")
		private EventType eventType;

		@JsonProperty("eventStatus")
		private UserTripsTable.Status eventStatus;

		@JsonProperty("price")
		private double price;

		@JsonProperty("description")
		private String description;

		@JsonProperty("paymentSource")
		private String paymentSource;

		@JsonProperty("paymentSourceId")
		private String paymentSourceId;

		@JsonProperty("paymentSourceDesc")
		private String paymentSourceDesc;

		@JsonProperty("approvalDate")
		private String approvalDate;

		@JsonProperty("createdDate")
		private String createdDate;

		@JsonProperty("updatedDate")
		private String updatedDate;

		@JsonProperty("archived")
		private boolean archived;

		private boolean adjustableWithCredits = false;
		private Double displayPrice;

		public enum TransactionEventType { // Line item types
			misc, trip_event, service_fee, travel_credit, seatreservation, webcheckin, change_fee, luggage, adjustment,
			booking_fee
		}

		private TransactionEventType transactionEventType;
		TravelCreditInfo travelCreditInfo;
		private String lineItemCtxData;
		@JsonProperty("multi_event")
		private Boolean multiEvent = false;

	}

	public enum TransactionLogItemType {
		status, gallopcash, discount, seatreservation, webcheckin, amout;
	}

	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	public static class TransactionLog {
		@JsonProperty("item")
		private TransactionLogItemType item;

		@JsonProperty("old_value")
		private Double oldValue;

		@JsonProperty("new_value")
		private Double newValue;

		@JsonProperty("old_value_str")
		private String oldValueStr;

		@JsonProperty("new_value_str")
		private String newValueStr;

		@JsonProperty("agent_id")
		private String agentId;

		@JsonProperty("log_time")
		private String logTime;

	}

	public enum Status {
		queued, modified, approved, cancelled, processed, voided, deleted;

	}

	public enum AdminApprovalStatus {
		pending, approved, rejected, expired;
	}

	public enum TransactionType {
		sale, refund, adjustment
	}

	public enum AdjustmentType {
		taxesNfees, parking, meals, drinks, internetOrPhone, traveldates, micscharges, routespringCredit;
	}

	@JsonProperty("approvalStatus")
	private AdminApprovalStatus approvalStatus;

	@JsonProperty("adjustmentType")
	private List<String> adjustmentType;

	@JsonProperty("adjustmentNote")
	private String adjustmentNote;

	@JsonProperty("attachment")
	private String adjustmentAttachment;

	@JsonProperty("type")
	private TransactionType type = TransactionType.sale;

	@JsonProperty("reviewedOn")
	private Date reviewedOn;

	@JsonProperty("reviewedBy")
	private String reviewedBy;

	@JsonProperty("disapprovalNote")
	private String disapprovalNote;

	private String bookedBy;
	private String multiBookingId;
	private String cancelledBy;

	@JsonProperty("note_to_admin")
	private String noteToAdmin;
	@JsonProperty("oop_reason")
	private String oopReason;

	@JsonProperty("user_id")
	private String userId;

	@JsonProperty("company_id")
	private Integer comanyId = -1;

	@JsonProperty("transaction_id")
	private String transactionId;

	@JsonProperty("bookingId")
	private String bookingId;

	@JsonProperty("sortkey_id")
	private String sortkeyId;

	@JsonProperty("trip_id")
	private String tripId;

	@JsonProperty("status")
	private Status status;

	@JsonProperty("data")
	private List<TransactionEvent> data;

	@JsonProperty("logs")
	private List<TransactionLog> logs;

	@JsonProperty("created")
	private String created;

	@JsonProperty("updated")
	private String updated;

	private String projectTagId;

}
