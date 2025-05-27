package com.routespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

	private String URL;
	private String caption;
	private Integer height;
	private Integer width;
	private String sizeCode;
	private String roomCode;

}
