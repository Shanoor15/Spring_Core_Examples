package com.nt.sbeans;

import java.time.LocalDate;

public class SeasonFinder {

    private LocalDate month;

    // Setter method for Setter Injection
    public void setMonth(LocalDate month) {
        this.month = month;
    }

    // Business method
    public String season(String user) {
        int mon = month.getMonthValue();

        if (mon >= 7 && mon <= 9) {
            return "Rainy Season ---> " + user;
        } 
        else if (mon >= 10 || mon <= 1) {
            return "Winter Season ---> " + user;
        } 
        else {
            return "Summer Season ---> " + user;
        }
    }
}
