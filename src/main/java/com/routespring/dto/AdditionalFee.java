package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalFee {

	public enum FeeType {
		BookingFee("Booking Fee"), ServiceFee("Service Fee");

		String label;

		private FeeType(String label) {
			this.label = label;
		}

		public String getLabel() {
			// TODO Auto-generated method stub
			return label;
		}
	}

	private FeeType type;
	private String displayLabel;
	private Double amount;

}
