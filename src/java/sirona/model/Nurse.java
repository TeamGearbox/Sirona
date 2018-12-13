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
public class Nurse {
    
    private StaffProfile profile;
    private ArrayList<Patient> tempPatientList;
    
    public Nurse(){
        
    }

    public StaffProfile getProfile() {
        return profile;
    }

    public void setProfile(StaffProfile profile) {
        this.profile = profile;
    }

    public ArrayList<Patient> getTempPatientList() {
        return tempPatientList;
    }

    public void setTempPatientList(ArrayList<Patient> tempPatientList) {
        this.tempPatientList = tempPatientList;
    }
    
    
}
