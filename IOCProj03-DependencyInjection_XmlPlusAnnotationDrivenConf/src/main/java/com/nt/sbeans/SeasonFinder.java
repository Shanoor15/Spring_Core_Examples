package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired  //field Injection
	private LocalDate date;
	

	public SeasonFinder() {
		System.out.println("SeasonFinder::0-param Constructor");
	}



	//Setter method for Setter Injection
	@Autowired 
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date=date;
	}
	
	public String showSeason(String user) {
		//get Current month of year
		int month = date.getMonthValue();
		if(month>=3 && month<=6)
			return "Summer Season::"+user;
		else if(month>=7 && month<=11)
			return "Rainy Season::"+user;
		else
			return "Winter Season::"+user;
	}
}
