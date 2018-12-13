
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;
import sirona.model.StaticClasses.*;

/**
 *
 * @author Jacinto Molina
 */
public class Day {
    //private int maxDays;
    //private Date dayDate;
    private DayName dayName;
    private boolean isHoliday;
    private String dayStringName;
    private int day;
    
    private ArrayList<Hour> listOfhour = new ArrayList<Hour>();
    
    
    public Day(int day, DayName dayName){
        this.day = day;
       
        this.dayName = dayName;
        this.isHoliday = false;
        
        this.dayStringName =this.dayName+":"+this.day;
        
        //Testing
        for(int i = 0; i < 2; i++){
          for(int j = 1; j < 13; j++){
            if(i == 0){
                this.listOfhour.add(StaticClasses.hourList.get("AM:"+j));
            }else{
                this.listOfhour.add(StaticClasses.hourList.get("PM:"+j));
            }
          }
        }
    }

    
    public ArrayList<Hour> getHourList(){
        return this.listOfhour;
    }

    public DayName getDayName() {
        return dayName;
    }

    public void setDayName(DayName dayName) {
        this.dayName = dayName;
    }

    public boolean isIsHoliday() {
        return isHoliday;
    }

    public void setIsHoliday(boolean isHoliday) {
        this.isHoliday = isHoliday;
    }
    
    public int getDayNum(){
        return this.day;
    }
    
    public String toString(){
        return this.dayName +" " + this.day;
    }
    
}
