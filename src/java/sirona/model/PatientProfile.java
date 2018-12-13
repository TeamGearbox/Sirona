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
 * @author jacin
 */
public class PatientProfile extends Profile{
    
    private PatientChart pc;
    private BillingInformation saveBillInfo;
    private String martialStatus;
    private String DOB;
    private Gender gender;
    private String race;
    private String ethnicity;
    private Image photo;
    private ArrayList<EmergencyContact> emergencyContactsList;
    private String address;
    private ArrayList<String> languages;

    public PatientProfile(PatientChart pc, BillingInformation saveBillInfo, String martialStatus, String DOB, Gender gender, String race, String ethnicity, Image photo, ArrayList<EmergencyContact> emergencyContactsList, String address, ArrayList<String> languages, String name, int phone, ClinicID clinicId, int mobilePhone, String email, Inbox inbox) {
        super(name, phone, clinicId, mobilePhone, email, inbox);
        this.pc = pc;
        this.saveBillInfo = saveBillInfo;
        this.martialStatus = martialStatus;
        this.DOB = DOB;
        this.gender = gender;
        this.race = race;
        this.ethnicity = ethnicity;
        this.photo = photo;
        this.emergencyContactsList = emergencyContactsList;
        this.address = address;
        this.languages = languages;
    }
    


    public PatientChart getPc() {
        return pc;
    }

    public void setPc(PatientChart pc) {
        this.pc = pc;
    }

    public BillingInformation getSaveBillInfo() {
        return saveBillInfo;
    }

    public void setSaveBillInfo(BillingInformation saveBillInfo) {
        this.saveBillInfo = saveBillInfo;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public String getDOB() {
        return DOB;
    }

    public Gender getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public Image getPhoto() {
        return photo;
    }

    public ArrayList<EmergencyContact> getEmergencyContactsList() {
        return emergencyContactsList;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public void setEmergencyContactsList(ArrayList<EmergencyContact> emergencyContactsList) {
        this.emergencyContactsList = emergencyContactsList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }
    
    
}
