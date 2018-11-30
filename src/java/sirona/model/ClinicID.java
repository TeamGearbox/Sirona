/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.nio.charset.StandardCharsets;

/**
 *
 * @author Jacinto Molina
 */
public class ClinicID {
    
    private String letterHalf;
    private int numHalf;
    
    private final int maxStrLen = 3;
    private final int minIntLen = 3;
    
    private String ID;
    
    public ClinicID(String id){
        
       this.letterHalf = id.substring(0,4);
       this.numHalf = Integer.valueOf(id.substring(4,id.length()));
        
    }
    
    // used to check if 
    public static boolean isValidID(String clinicid){ //throws InvalidDataTypeException{
        // "abc123"
        // Check the length
        if(clinicid.length() == 6){
       char[] token = clinicid.toCharArray();
           for(int i = 0; i< token.length; i++){
               
               int asciiVal = token[i];
               if (i >= 3){ // numbers are 48-57 0-9
                   // Numbers
                   if(asciiVal >= 48 && asciiVal <= 57){
                       // its a number 
                   }else{
                       System.err.println(">:| Wrong Data Type: Please enter a format of abc123!! ");
                      return false;
                       //throw new InvalidDataTypeException("Error: Worng Format for the ClinicID;");
                   }
               }else{
                   //Letter check  65-90 (caps) and 97 - 122 (lowerCase)
                  if((asciiVal <= 90 && asciiVal >= 65) || (asciiVal >= 97 && asciiVal <= 122 )){
                      // its a letter might have to switch it around./
                  }else{
                       System.err.println("Error invalid ID format: Please enter the correct format of abc123");
                       //throw new InvalidDataTypeException("Error: Wrong format for the ID");
                       return false;
                    }
                }
            }
        }else{
            System.err.println(" >:| Error: Invalid length, Please enter A six character id.");
            return false;
        }
        return true;
    }

    public String getLetterHalf() {
        return letterHalf;
    }

    public void setLetterHalf(String letterHalf) {
        this.letterHalf = letterHalf;
    }

    public int getNumHalf() {
        return numHalf;
    }

    public void setNumHalf(int numHalf) {
        this.numHalf = numHalf;
    }
    
    
}
