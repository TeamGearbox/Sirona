/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import sirona.model.StaticClasses.TimeSlotHalf;

/**
 *
 * @author Jacinto Molina
 */
public class Hour {
    
    private TimeSlot top;
    private TimeSlot bottom;
    private boolean isAM;
    private int hourTime;
    private boolean isBooked;
    private String hourName;
    
    
    
    public Hour(boolean isMorning, int hour){ //Add a Mins Class.
        this.hourTime = hour;
        this.isAM = isMorning;
        this.top = new TimeSlot(hour,TimeSlotHalf.Top);
        this.bottom = new TimeSlot(hour,TimeSlotHalf.Bottom);
        
        if(this.isAM == false){
            this.hourName = "PM:"+this.hourTime;
        }else{
            this.hourName = "AM:"+this.hourTime;
        }
    }
    
    public String getName(){
        return this.hourName;
    }
    public boolean isValidHour(int time){
        // between 1-12
        
        
        return true;
    }

    public TimeSlot getTop() {
        return top;
    }

    public void setTop(TimeSlot top) {
        this.top = top;
    }

    public TimeSlot getBottom() {
        return bottom;
    }

    public void setBottom(TimeSlot bottom) {
        this.bottom = bottom;
    }

    public boolean isIsAM() {
        return isAM;
    }

    public void setIsAM(boolean isAM) {
        this.isAM = isAM;
    }
    
    public TimeSlot getTimeSlot(){
        
       // Depending on the mins
       
       return this.top; 
    }
    
    public int getHourTime() {
        return this.hourTime;
    }

    public void setHourTime(int hourTime) {
        this.hourTime = hourTime;
    }
    
    public String toString(){
        return this.hourName;
    }
    
}
