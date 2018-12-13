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
public class IndieProfile {
    
    private boolean isActive;
    private Year lastActive;
    private int IDF;
    private String name;
    private int phone;
    private ClinicID clinicId;
    private int mobilePhone;
    private String email;
    private Inbox inbox;
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

    public IndieProfile(boolean isActive, Year lastActive, int IDF, String name, int phone, ClinicID clinicId, int mobilePhone, String email, Inbox inbox, PatientChart pc, BillingInformation saveBillInfo, String martialStatus, String DOB, Gender gender, String race, String ethnicity, Image photo, ArrayList<EmergencyContact> emergencyContactsList, String address, ArrayList<String> languages) {
        this.isActive = isActive;
        this.lastActive = lastActive;
        this.IDF = IDF;
        this.name = name;
        this.phone = phone;
        this.clinicId = clinicId;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.inbox = inbox;
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

    public int getPhone() {
        return phone;
    }

    public ClinicID getClinicId() {
        return clinicId;
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

    public PatientChart getPc() {
        return pc;
    }

    public BillingInformation getSaveBillInfo() {
        return saveBillInfo;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setClinicId(ClinicID clinicId) {
        this.clinicId = clinicId;
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

    public void setPc(PatientChart pc) {
        this.pc = pc;
    }

    public void setSaveBillInfo(BillingInformation saveBillInfo) {
        this.saveBillInfo = saveBillInfo;
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
