/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.HashMap;

/**
 *
 * @author Jacinto Molina
 */
public class StaticClasses {
    
    public static int dayType = 1;
    public enum MonthName{ January, February, March, April, May, June, July, August, September, 
                    November, December};
    public enum Gender{Male, Female};
    public enum StaffType{Nurse, Doctor, Clerk}
    public enum DayName{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    public enum TimeSlotHalf{Top,Bottom};
    /**
     *
     */
    public static HashMap<String, Appointment> uniqueAppList = new HashMap();
    
    public static HashMap<String, Hour> hourList = new HashMap();
    
    
    
    public static void InitEverything(){
        
        //making Hours
        
        for(int index = 1; index < 13; index++){
            Hour pmh = new Hour(false, index);
            Hour amH = new Hour(true, index);
            //System.out.println(pmh.getName());
            hourList.put(pmh.getName(), pmh);
            hourList.put(amH.getName(), amH);
            //System.out.println(StaticClasses.hourList.get("AM:"+index).getHourTime());
            //System.out.println(StaticClasses.hourList.get("PM:"+index).getHourTime());
               
        }
        
        //making months
         for(int index = 0; index < 12; index++){
            
        }
        //
        
        
    }
    
    
    
}
