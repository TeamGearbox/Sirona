/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;
import sirona.model.StaticClasses.*;

/**
 *
 * @author Jacinto Molina
 */
public class Nurse{
    private StaffProfile profile;
    private ArrayList<Patient> tempPatientList;
    
    public Nurse(){
        this.profile  = new StaffProfile(StaffType.Nurse);
        this.tempPatientList = new ArrayList<Patient>();
    }
     public Nurse(ArrayList<Patient> p, StaffProfile sp){
        this.profile = sp;
        this.tempPatientList = p;
    }

    public StaffProfile getProfile() {
        return profile;
    }

    public void setProfile(StaffProfile profile) {
        this.profile = profile;
    }
    
    public void addPatientToList(Patient p){
        this.tempPatientList.add(p);
    }
    
    public void removePatientFromList(Patient p){
        this.tempPatientList.remove(p);
    }

    public ArrayList<Patient> getTempPatientList() {
        return tempPatientList;
    }

    public void setTempPatientList(ArrayList<Patient> tempPatientList) {
        this.tempPatientList = tempPatientList;
    }
    
    
}
