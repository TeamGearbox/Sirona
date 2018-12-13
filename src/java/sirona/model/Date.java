/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;


import sirona.model.StaticClasses.*;

/**
 *
 * @author Jacinto Molina
 */
public class Date {
    
    private MonthName month;
    private Day day;
    private Hour hour;
    
    public Date(MonthName pMonth, Day pDay, Hour pHour){
        this.month = pMonth;
        this.day = pDay;
        this.hour = pHour;
    }

    public MonthName getMonth() {
        return month;
    }

    public void setMonth(MonthName month) {
        this.month = month;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Hour getHour() {
        return hour;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }
    
    public String toString(){
        return this.month + "," + this.day.toString() + " " + this.hour.toString() + StaticClasses.currentYear;
    }
    //TODO: ToString
    
}
