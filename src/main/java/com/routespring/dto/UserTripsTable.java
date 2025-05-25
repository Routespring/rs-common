package com.routespring.dto;

public class UserTripsTable {

	public enum Status {
		draft, quoted, selected, booked, ticketed, expensed, cancelled, refund, expired, deleted, archived, voided;

		public static int compare(Status s1, Status s2) {
			return s1.ordinal() - s2.ordinal();
		}
	}

	public enum EventType {
		flight, hotel, cars, all, other, carFlight, carHotel, hotelFlight, train;

		public boolean isFlightType() {
			return this.equals(flight) || this.equals(all);
		}

		public boolean isHotelType() {
			return this.equals(hotel) || this.equals(all);
		}

		public boolean isCarType() {
			return this.equals(cars) || this.equals(all);
		}
	}

}
