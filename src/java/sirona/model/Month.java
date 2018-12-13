/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;
import sirona.model.StaticClasses.DayName;
import sirona.model.StaticClasses.MonthName;

/**
 *
 * @author Jacinto Molina
 */
public class Month {
    private ArrayList<Day> listOfDays;
    private MonthName monthDate;
    private int maxDay;
    
    public Month(int days, MonthName name){
        
        this.maxDay = days;
        monthDate = name;
        
        for(int i = 1; i < (days+1);i++){
            this.listOfDays.add(new Day(i,getDayDay(StaticClasses.dayType)));
            StaticClasses.dayType++;
        }
        
    }
    
    public DayName getDayDay(int i){
        if(i>7){
            i=1;
            StaticClasses.dayType = 1;
        }
        switch(i){
            case 1:
               return DayName.Monday;
            case 2:
                return DayName.Tuesday;
            case 3:
                return DayName.Wednesday;
            case 4:
                return DayName.Thursday;
            case 5:
                return DayName.Friday;
            case 6:
                return DayName.Saturday;
            case 7:
                return DayName.Sunday;
        }
        return DayName.Monday;
    }

    public ArrayList<Day> getListOfDays() {
        return listOfDays;
    }

    public void setListOfDays(ArrayList<Day> listOfDays) {
        this.listOfDays = listOfDays;
    }

    public MonthName getMonthDate() {
        return monthDate;
    }

    public void setMonthDate(MonthName monthDate) {
        this.monthDate = monthDate;
    }

    public int getMaxDay() {
        return maxDay;
    }

    public void setMaxDay(int maxDay) {
        this.maxDay = maxDay;
    }
    
    
}
