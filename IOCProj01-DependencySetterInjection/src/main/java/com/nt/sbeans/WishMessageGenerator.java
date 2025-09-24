//WishMessageGenerator----> (Target Class)
package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time;
	
	//Setter method for Setter Injection
	public void setTime(LocalTime time) {
		this.time=time;
	}
	
	//B.Method
	public String showWishMessage(String user) {
		//get current hour of the day
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
