/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.io.File;

/**
 *
 * @author jacin
 */
public class Patient {
    
    
    private PatientProfile patientInfo;
    // abc123
    private ClinicID doctorID;
    private String username;
    private Insurance ins;
    private boolean isActive;
    private Appointment app;
    private double account;
    
    public Patient(PatientProfile profile, ClinicID DocAssID, String userName, Insurance ins){
       this.patientInfo = profile;
       this.username = userName;
       this.doctorID = DocAssID;
       this.ins = ins;
       this.isActive = true;
       this.account = 0.0;
    }
    
    public Patient(File patientInfo){
        //File Read in With Data//
        /*  patient info 
            doc id
            username
            insureance 
            
        */
        
        
        
    }

    public PatientProfile getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientProfile patientInfo) {
        this.patientInfo = patientInfo;
    }

    public ClinicID getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(ClinicID doctorID) {
        this.doctorID = doctorID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Insurance getIns() {
        return ins;
    }

    public void setIns(Insurance ins) {
        this.ins = ins;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Appointment getApp() {
        return app;
    }

    public void setApp(Appointment app) {
        this.app = app;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
    
}
