/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.awt.Image;
import java.util.ArrayList;
import sirona.model.StaticClasses.Gender;

/**
 *
 * @author Jacinto Molina
 */
public class IndieProfile {
    
    private boolean isActive;
    private Year lastActive;
    private int IDF;
    private String name;
    private int mobilePhone;
    private String email;
    private Inbox inbox;
    private Image photo;
    private String address;
  

    public IndieProfile(boolean isActive, Year lastActive, int IDF, String name, int phone, ClinicID clinicId, int mobilePhone, String email, Inbox inbox, PatientChart pc, BillingInformation saveBillInfo, String martialStatus, String DOB, Gender gender, String race, String ethnicity, Image photo, ArrayList<EmergencyContact> emergencyContactsList, String address, ArrayList<String> languages) {
        this.isActive = isActive;
        this.lastActive = lastActive;
        this.IDF = IDF;
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.inbox = inbox;
        this.photo = photo;
        this.address = address;
    }
    
    public IndieProfile(){
        this.isActive = false;
        this.lastActive = new Year();
        this.IDF = 0;
        this.name = "";
        this.mobilePhone = 0;
        this.email = "";
        this.inbox = new Inbox();
       // this.photo = ;
        this.address = "";
    }
    

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Year getLastActive() {
        return lastActive;
    }

    public void setLastActive(Year lastActive) {
        this.lastActive = lastActive;
    }

    public int getIDF() {
        return IDF;
    }

    public void setIDF(int IDF) {
        this.IDF = IDF;
    }

    public String getName() {
        return name;
    }


    public int getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public Inbox getInbox() {
        return inbox;
    }

    
    public Image getPhoto() {
        return photo;
    }

   
    public String getAddress() {
        return address;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.mobilePhone = phone;
    }


    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
}
