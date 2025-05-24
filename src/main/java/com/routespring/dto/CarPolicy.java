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
	private TraflaCarClass maxCarClassAllowed;
	private List<TraflaCarType> allowedTypes;

	public TraflaCarClass getMaxCarClassAllowed() {
		return maxCarClassAllowed;
	}

	public void setMaxCarClassAllowed(TraflaCarClass maxCarClassAllowed) {
		this.maxCarClassAllowed = maxCarClassAllowed;
	}

	public List<TraflaCarType> getAllowedTypes() {
		return allowedTypes;
	}

	public void setAllowedTypes(List<TraflaCarType> allowedTypes) {
		this.allowedTypes = allowedTypes;
	}
}
