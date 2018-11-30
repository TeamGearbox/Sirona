/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;

/**
 *
 * @author jacin
 */
public class InsuranceSystem {
    
    private ArrayList<Insurance> supportiveInsurance;
    
    public InsuranceSystem(){
        
    }

    public ArrayList<Insurance> getSupportiveInsurance() {
        return supportiveInsurance;
    }

    public void setSupportiveInsurance(ArrayList<Insurance> supportiveInsurance) {
        this.supportiveInsurance = supportiveInsurance;
    }
    
    
    
}
