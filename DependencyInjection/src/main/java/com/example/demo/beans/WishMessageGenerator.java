package com.example.demo.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Builder;

@Component
@Builder
public class WishMessageGenerator {

	@Autowired
	private Calendar calendar;

	public String generateWishMessage(String userName) {
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if (hour < 12)
			return "Good Morning:: " + userName;
		else if (hour < 16)
			return "Good Afternoon:: " + userName;
		else if (hour < 20)
			return "Good Evening:: " + userName;
		else
			return "Good Night:: " + userName;
	}

	

}
