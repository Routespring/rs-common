package com.routespring.dto;

import com.routespring.dto.HotelFeedbackDTO.HotelFeedbackNegativeReasons;
import com.routespring.dto.HotelFeedbackDTO.HotelFeedbackTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
	HotelFeedbackTypes feedback = HotelFeedbackTypes.NONE;
	HotelFeedbackNegativeReasons[] negativeFeedbackReason;
	String comments;

}
