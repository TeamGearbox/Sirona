/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author jacin
 */
public class Patient {
    
    
    private PatientProfile profile;
    // abc123
    private ClinicID doctorID;
    private String username;
    private Insurance ins;
    private boolean isActive;
    private Appointment app;
    private double account;


    
    public Patient(PatientProfile profile, ClinicID doctorID, String userName, Insurance ins){
       this.profile = profile;
       this.username = userName;
       this.doctorID = doctorID;
       this.ins = ins;
       this.isActive = true;
       this.account = 0.0;
    }

    public PatientProfile getProfile() {
        return profile;
    }

    public void setProfile(PatientProfile profile) {
        this.profile = profile;
    }

    public ClinicID getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(ClinicID doctorID) {
        this.doctorID = doctorID;
    }

    public String getUsername() {
        return this.profile.getClinicId().toString();
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
