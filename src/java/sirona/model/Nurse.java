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
    
    private StaffProfile workInfo;
    private ArrayList<Patient> tempPatientList;
    
    public Nurse(){
        
    }

    public StaffProfile getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(StaffProfile workInfo) {
        this.workInfo = workInfo;
    }

    public ArrayList<Patient> getTempPatientList() {
        return tempPatientList;
    }

    public void setTempPatientList(ArrayList<Patient> tempPatientList) {
        this.tempPatientList = tempPatientList;
    }
    
    
}
