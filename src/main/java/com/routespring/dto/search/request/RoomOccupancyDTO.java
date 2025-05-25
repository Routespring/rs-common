package com.routespring.dto.search.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomOccupancyDTO {
	private int numberOfChildren;
	private int numberOfTraveller;
	private List<Integer> childrenAges;
	private int room;
}
