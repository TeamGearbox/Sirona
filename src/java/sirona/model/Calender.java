/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

/**
 *
 * @author Jacinto Molina
 */
// SingletonClass - one instance for the entire project;
public class Calender {
    
    private static Calender cal;
    private Year dateSlot;
    private boolean isValid;
    
    private Calender(){
        StaticClasses.InitEverything();
        
        this.dateSlot = new Year(0000);
        this.isValid = true;
    }
    
    public static Calender getInstance(){
         if(cal == null){
             cal = new Calender();
         }
         return cal;
    }

    
    public void setYear(int newYear){
        this.dateSlot.setYear(newYear);
    }
    public boolean checkIsValid(String mss){
        
        
        return true;
    }
    
   

    public Year getDateSlot() {
        return dateSlot;
    }

    public void setDateSlot(Year dateSlot) {
        this.dateSlot = dateSlot;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
    
    
    
    
    
}
