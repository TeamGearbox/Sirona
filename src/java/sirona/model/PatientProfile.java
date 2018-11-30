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
    
    public PatientProfile(String pName, int pPhone,ClinicID cliID, int mPhone, String pAddress, ArrayList<String> pLanguges, String Email, String martialStatus, String pDOB, 
                    Gender gen, String pRace, Inbox pInbox, String pEthnicity, Image pImage,ArrayList<EmergencyContact> pEMs, PatientChart pc, BillingInformation saveBI){
        
        super( pName,  pPhone, cliID,  mPhone,  pAddress,  pLanguges,  Email,  martialStatus,  pDOB, 
                     gen,  pRace,  pInbox,  pEthnicity,  pImage, pEMs );
        this.pc = pc;
        this.saveBillInfo = saveBI;
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
    
}
