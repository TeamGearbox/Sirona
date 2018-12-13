package sirona.model;

import java.util.ArrayList;
import java.util.Scanner;
import sirona.model.StaticClasses.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacin
 */
public class Driver {
    
    private static ArrayList<Integer> num = new ArrayList<Integer>();
    
    
    public static void intArr(){
        for(int i = 0; i< 10; i++){
            num.add(i);
        }
    }
    
    
    
    public static void main(String[] args){
        
        Date d = new Date(MonthName.March,new Day(19,DayName.Tuesday),new Hour(true,10));
        
        Appointment app = new Appointment(d,true, false,new ClinicID("bca321"), new ClinicID("jkl786"));
    
    //Test get Appointment Tostring?
    // Check Creation
    // Check Uniqueness of the Appointment.
    // if isvalid is off remove from Appointment list. 
   
    //To String Failed
    /*Day: Monday, Month: March, Hour: sirona.model.TimeSlot@1db9742
    Patient ID: sirona.model.ClinicID@106d69c
    Doctor ID: sirona.model.ClinicID@52e922
    */
   // System.out.println(app.toString());
      
        StaticClasses.InitEverything();
        System.out.println(DayName.Monday);
        
        //Clock system worked. 
        for(int i = 0; i < 2; i++){
            for(int j = 1; j < 13; j++){   
               
                if(i == 0){
                    System.out.println(StaticClasses.hourList.get("AM: "+j).getName());
                }else{
                    System.out.println(StaticClasses.hourList.get("PM: "+j).getName());
                }
            
             }
        }
        String hello = "Hello World";
        
        System.out.println(hello);
        
        String ch = hello.substring(0,4);
        System.out.println(ch);
        Scanner scan = new Scanner(System.in);
        while(true){
        
            System.out.println("Please enter ID");
            String id = scan.next();

            if(ClinicID.isValidID(id)){
                System.out.println("Success Added to Database...");
                ClinicID cl = new ClinicID(id);
                
                break;

            }else{
                    System.err.println(" >:| Try Again..!");
                }
        }   
        
        //char[] token = hello.toCharArray();
        
       /* for(int index = 0; index < token.length; index++){
            int val = token[index];
            
            System.out.println("ascii Value of " + token[index] + " is: " + val + " ");
            
        }*/
        
        
        
        
        
    }
    
}
