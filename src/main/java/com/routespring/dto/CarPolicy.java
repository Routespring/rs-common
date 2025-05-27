package com.routespring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CarPolicy extends TravelPolicy {
	private CarClass maxCarClassAllowed;
	private List<CarType> allowedTypes;

	public CarClass getMaxCarClassAllowed() {
		return maxCarClassAllowed;
	}

	public void setMaxCarClassAllowed(CarClass maxCarClassAllowed) {
		this.maxCarClassAllowed = maxCarClassAllowed;
	}

	public List<CarType> getAllowedTypes() {
		return allowedTypes;
	}

	public void setAllowedTypes(List<CarType> allowedTypes) {
		this.allowedTypes = allowedTypes;
	}
}
