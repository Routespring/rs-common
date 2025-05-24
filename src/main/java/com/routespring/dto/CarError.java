package com.routespring.dto;

import java.util.List;

public class CarError {
	List<VehicleLocationSearchError> errors;

	public List<VehicleLocationSearchError> getErrors() {
		return errors;
	}

	public void setErrors(List<VehicleLocationSearchError> errors) {
		this.errors = errors;
	}
}
