package com.routespring.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelImage {

	private Map<String, List<Image>> imageByRoomTypes = new HashMap<>();
	private Map<String, List<Image>> imagesByHotelTypes = new HashMap<>();
	private Map<String, List<Image>> otherImages = new HashMap<>();

}
