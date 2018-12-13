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
public class Doctor {

   
    private StaffProfile profile;
    private ArrayList<Patient> patientList;
    private ArrayList<Appointment> appList;
    
    public Doctor(){
        this.profile = new StaffProfile( StaffType.Doctor);
        this.patientList = new ArrayList<Patient>();
        this.appList = new ArrayList<Appointment>();
    }
     public Doctor(ArrayList<Patient> pl, ArrayList<Appointment> app, StaffProfile w){
        this.patientList = pl;
        this.appList = app;
        this.profile = w;
    }
    
    public void removePatient(Patient remPat){
        this.patientList.remove(remPat);
    }
    
    public void addPatient(Patient addPat){
        this.patientList.add(addPat);
    }
    
    public void reInitPatientList(ArrayList<Patient> lisApp){
        this.patientList = lisApp;
    }
    
    
   
    public void removeAppointment(Appointment remPat){
        this.appList.remove(remPat);
    }
    
    public void addAppointment(Appointment addApp){
        this.appList.add(addApp);
    }
    
    public void reInitAppList(ArrayList<Appointment> lisPat){
        this.appList = lisPat;
    }
    
    
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public ArrayList<Appointment> getAppList() {
        return appList;
    }
    public StaffProfile getProfile(){
        return this.profile;
    }

    public void setProfile(StaffProfile profile) {
        this.profile = profile;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public void setAppList(ArrayList<Appointment> appList) {
        this.appList = appList;
    }
    
    
}
