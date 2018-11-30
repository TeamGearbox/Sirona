/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import sirona.model.StaticClasses.TimeSlotHalf;

/**
 *
 * @author jacinto
 */
public class TimeSlot {
     
    private boolean isOpen;
    private TimeSlotHalf whichHalf;
    private ClinicID patientID;
    private ClinicID docID;
    private String TimeStart;
    
    public TimeSlot(int hour, TimeSlotHalf half){
        
        this.whichHalf = half;
        this.isOpen = true;
        
        if(half == TimeSlotHalf.Top){
            
            this.TimeStart = hour + ":" + 00;
            
        }else{
               this.TimeStart = hour + ":" + 30;
        }
        
        
    }

    public String getTimeStartName(){
        return this.TimeStart;
    }
    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public ClinicID getPatientID() {
        return patientID;
    }

    public void setPatientID(ClinicID patientID) {
        this.patientID = patientID;
    }

    public ClinicID getDocID() {
        return docID;
    }

    public void setDocID(ClinicID docID) {
        this.docID = docID;
    }
    
     
}
