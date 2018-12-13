/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;

/**
 *
 * @author Jacinto Molina
 */
public class InsuranceSystem {
    
    private ArrayList<Insurance> supportiveInsurance;
    
    public InsuranceSystem(){
        this.supportiveInsurance = new ArrayList<Insurance>();
    }
      public InsuranceSystem(ArrayList<Insurance> sI){
          this.supportiveInsurance = sI;
        
    }
      
    public void removeInsurance(Insurance in){
        this.supportiveInsurance.remove(in);
    }
      
     public void addInsurance(Insurance in){
         this.supportiveInsurance.add(in);
     }  
      
    public ArrayList<Insurance> getSupportiveInsurance() {
        return supportiveInsurance;
    }

    public void setSupportiveInsurance(ArrayList<Insurance> supportiveInsurance) {
        this.supportiveInsurance = supportiveInsurance;
    }
    
    
    
}
