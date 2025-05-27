package com.routespring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatRows {
	private List<SeatRow> row;
	private List<String> characteristic;
	private Integer rowCode;

}
