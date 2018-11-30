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
public class IndieProfile extends Profile {
    
    private boolean isActive;
    private Year lastActive;
    private int IDF;
    
    
    
    public IndieProfile(String pName, int pPhone,ClinicID cliID, int mPhone, String pAddress, ArrayList<String> pLanguges, String Email, String martialStatus, String pDOB, 
                    Gender gen, String pRace, Inbox pInbox, String pEthnicity, Image pImage,ArrayList<EmergencyContact> pEMs, PatientChart pc, BillingInformation saveBI, boolean isActive, Year lActive, int pIDF){
        
        super( pName,  pPhone, cliID,  mPhone,  pAddress,  pLanguges,  Email,  martialStatus,  pDOB, 
                     gen,  pRace,  pInbox,  pEthnicity,  pImage, pEMs );
        this.isActive = isActive;
        this.lastActive = lActive;
        this.IDF = pIDF;
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
    
    
    
}
