package sirona.model;

import java.util.ArrayList;
import java.util.Scanner;
import sirona.model.StaticClasses.DayName;

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
        
        StaticClasses.InitEverything();
        System.out.println(DayName.Monday);
        
        for(int i = 0; i < 2; i++){
            for(int j = 1; j < 13; j++){   
               
                if(i == 0){
                    System.out.println(StaticClasses.hourList.get("AM:"+j).getName());
                }else{
                    System.out.println(StaticClasses.hourList.get("PM:"+j).getName());
                }
            
             }
        }
        
        
        /*System.out.println(hello);
        
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
                    System.out.println(" >:| Try Again..!");
                }
        }   
        
        //char[] token = hello.toCharArray();
        
       /* for(int index = 0; index < token.length; index++){
            int val = token[index];
            
            System.out.println("ascii Value of " + token[index] + " is: " + val + " ");
            
        }*/
        
        
        
        
        
    }
    
}
