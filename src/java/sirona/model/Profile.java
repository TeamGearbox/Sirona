/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.awt.Image;
import java.util.ArrayList;
import sirona.model.StaticClasses.*;

/**
 *
 * @author Jacinto Molina
 */
public class Profile {
    
    private String name;
    private int phone;
    private ClinicID clinicId;
    private int mobilePhone;
    private String address;
    private ArrayList<String> languages;
    private String email;
    private String martialStatus;
    private String DOB;
    private Gender gender;
    private String race;
    private Inbox inbox;
    private String ethnicity;
    private Image photo;
    private ArrayList<EmergencyContact> emergencyContactsList;
    
    public Profile(String pName, int pPhone,ClinicID cliID, int mPhone, String pAddress, ArrayList<String> pLanguges, String Email, String martialStatus, String pDOB, 
                    Gender gen, String pRace, Inbox pInbox, String pEthnicity, Image pImage,ArrayList<EmergencyContact> pEMs ){
        
        this.name = pName;
        this.phone = pPhone;
        this.clinicId = cliID;
        this.mobilePhone = mPhone;
        this.address = pAddress;
        this.languages = pLanguges;
        this.martialStatus = martialStatus;
        this.email = Email;
        this.gender = gen;
        this.DOB = pDOB;
        this.race = pRace;
        this.inbox = pInbox;
        this.ethnicity = pEthnicity;
        this.photo = pImage;
        this.emergencyContactsList = pEMs;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ClinicID getClinicId() {
        return clinicId;
    }

    public void setClinicId(ClinicID clinicId) {
        this.clinicId = clinicId;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    
    public ArrayList<EmergencyContact> getEmergencyContactList(){
        return this.emergencyContactsList;
    }
    public void addEmergencyContact(EmergencyContact lifeForm){
        this.emergencyContactsList.add(lifeForm);
    }
    public void removeEmergencyContact(EmergencyContact lifeFormDeleted){
        this.emergencyContactsList.remove(lifeFormDeleted);
    }
    public void reInitEmergencyContactList(ArrayList<EmergencyContact> list){
        this.emergencyContactsList = list;
    }
}
