package com.routespring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightHighlights {
	private boolean isSameDayFlight;
	private boolean isRedEyeFlight;
	private boolean isWithinGivenTimeConstraint;
	private boolean hasShortLayover;
	private boolean hasPreferredAirline;
	private boolean hasPreferredAirport;
	private boolean hasPreferredAlliance;

	private boolean hasLongLayover;
	private boolean hasOvernightLayover;
	private boolean hasChangeOfAirport;
	private boolean mixedClass = false;
	private String topFlightReason;
	private OutOfPolicyContext outOfPolicyContext;

	public OutOfPolicyContext getOutOfPolicyContext() {
		return outOfPolicyContext;
	}

	public void setOutOfPolicyContext(OutOfPolicyContext ReasonCode) {
		this.outOfPolicyContext = ReasonCode;
	}

	public boolean isHasChangeOfAirport() {
		return hasChangeOfAirport;
	}

	public void setHasChangeOfAirport(boolean hasChangeOfAirport) {
		this.hasChangeOfAirport = hasChangeOfAirport;
	}

	Boolean withinPolicy;

	public boolean isSameDayFlight() {
		return isSameDayFlight;
	}

	public void setSameDayFlight(boolean isSameDayFlight) {
		this.isSameDayFlight = isSameDayFlight;
	}

	public boolean isRedEyeFlight() {
		return isRedEyeFlight;
	}

	public void setRedEyeFlight(boolean isRedEyeFlight) {
		this.isRedEyeFlight = isRedEyeFlight;
	}

	public boolean isWithinGivenTimeConstraint() {
		return isWithinGivenTimeConstraint;
	}

	public void setWithinGivenTimeConstraint(boolean isWithinGivenTimeConstraint) {
		this.isWithinGivenTimeConstraint = isWithinGivenTimeConstraint;
	}

	public boolean isHasShortLayover() {
		return hasShortLayover;
	}

	public void setHasShortLayover(boolean hasShortLayover) {
		this.hasShortLayover = hasShortLayover;
	}

	public boolean isHasPreferredAirline() {
		return hasPreferredAirline;
	}

	public void setHasPreferredAirline(boolean hasPreferredAirline) {
		this.hasPreferredAirline = hasPreferredAirline;
	}

	public boolean isHasPreferredAirport() {
		return hasPreferredAirport;
	}

	public void setHasPreferredAirport(boolean hasPreferredAirport) {
		this.hasPreferredAirport = hasPreferredAirport;
	}

	public Boolean getWithinPolicy() {
		return withinPolicy;
	}

	public void setWithinPolicy(Boolean withinPolicy) {
		this.withinPolicy = withinPolicy;
	}

	public boolean isHasPreferredAlliance() {
		return hasPreferredAlliance;
	}

	public void setHasPreferredAlliance(boolean hasPreferredAlliance) {
		this.hasPreferredAlliance = hasPreferredAlliance;
	}

	public String getTopFlightReason() {
		return topFlightReason;
	}

	public void setTopFlightReason(String topFlightReason) {
		this.topFlightReason = topFlightReason;
	}

	public boolean isHasLongLayover() {
		return hasLongLayover;
	}

	public void setHasLongLayover(boolean hasLongLayover) {
		this.hasLongLayover = hasLongLayover;
	}

	public boolean isHasOvernightLayover() {
		return hasOvernightLayover;
	}

	public void setHasOvernightLayover(boolean hasOvernightLayover) {
		this.hasOvernightLayover = hasOvernightLayover;
	}

	public boolean isMixedClass() {
		return mixedClass;
	}

	public void setMixedClass(boolean mixedClass) {
		this.mixedClass = mixedClass;
	}
}
