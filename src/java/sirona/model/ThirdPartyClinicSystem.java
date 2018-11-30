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
public class ThirdPartyClinicSystem {
    
    private ArrayList<ClinicSystem> AllClinicsInSystem;
    
    public ThirdPartyClinicSystem(){
        
    }

    public ArrayList<ClinicSystem> getAllClinicsInSystem() {
        return AllClinicsInSystem;
    }

    public void setAllClinicsInSystem(ArrayList<ClinicSystem> AllClinicsInSystem) {
        this.AllClinicsInSystem = AllClinicsInSystem;
    }
    
    
}
