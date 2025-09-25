package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	
	private LocalDate date;
	private LocalTime time;
	
	//Parameterized Constructor fo constructor injection
	public WishMessageGenerator(LocalDate date, LocalTime time) {
		this.date = date;
		this.time = time;
		System.out.println("WishMessageGenerator::2-param Constructor");
		
	}

	//B.method
	public String showWishMessage(String user) {
		//get Current hour of the day
		int hour = time.getHour();
		//generate wishMessage based on the current hour of the day
				if(hour<12) {
					return "Good Morning "+user;
				}else if(hour<16) {
					return "Good AfterNoon "+user;
				}else {
					return "Good Evening "+user;
				}
	}
}
