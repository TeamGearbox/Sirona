/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.sql.Time; 
import sirona.model.StaticClasses.*;
/**
 *
 * @author Jacinto Molina
 */

public class Appointment {
    
    private DayName day;
    private MonthName month;
    private Time hour;
    private boolean isValid;
    private boolean isAM;
    private ClinicID patientID;
    private ClinicID doctorID;
    private String recName;
    
    public Appointment(DayName pDay, MonthName pMonth, Time pHour, boolean pIsValid, boolean pIsAm, ClinicID pPatientID, ClinicID pDoctorID){
        this.day = pDay;
        this.month = pMonth;
        this.hour = pHour;
        this.isValid = pIsValid;
        this.isAM = pIsAm;
        this.patientID = pPatientID;
        this.doctorID = pDoctorID;
        
        // check to see if member varibles arent null;
        this.recName = (this.day + " " + this.month + " " + this.hour + " " + this.patientID);
        
        StaticClasses.uniqueAppList.put(this.recName, this);
        
    }
    

    public String getReciptName(){
        return this.recName;
    }
    
    public String setReciptName(String recN){
        return this.recName = recN;
    }
    
    public DayName getDay() {
        return day;
    }

    public void setDay(DayName day) {
        this.day = day;
    }

    public MonthName getMonth() {
        return month;
    }

    public void setMonth(MonthName month) {
        this.month = month;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public boolean isIsAM() {
        return isAM;
    }

    public void setIsAM(boolean isAM) {
        this.isAM = isAM;
    }

    public ClinicID getPatientID() {
        return patientID;
    }

    public void setPatientID(ClinicID patientID) {
        this.patientID = patientID;
    }

    public ClinicID getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(ClinicID doctorID) {
        this.doctorID = doctorID;
    }
}
