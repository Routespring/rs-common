package com.routespring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomOccupancyDTO {

	private Integer numberOfAdult;
	private Integer numberOfChildren;
	private List<Integer> childrenAges;
	private List<Integer> adultsAges;

}
