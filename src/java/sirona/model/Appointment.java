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
    private TimeSlot hour;
    private boolean isValid;
    private boolean isAM;
    private ClinicID patientID;
    private int dayNum;
    private ClinicID doctorID;
    private String recName;
    private Date Dday;
    
    public Appointment(Date d, boolean pIsValid, boolean pIsAm, ClinicID pPatientID, ClinicID pDoctorID){
        this.day = d.getDay().getDayName();
        this.dayNum = d.getDay().getDayNum();
        this.month = d.getMonth();
        this.hour = d.getHour().getTimeSlot();
        this.Dday = d;
        this.isValid = pIsValid;
        this.isAM = pIsAm;
        this.patientID = pPatientID;
        this.doctorID = pDoctorID;
        
        // check to see if member varibles arent null;
        this.recName = ("Day: "+ d.getDay().toString() + ", Month: " + this.month + ", Hour: " + d.getHour().toString() );
        
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

    public TimeSlot getHour() {
        return hour;
    }

    public void setHour(TimeSlot hour) {
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
    
    //Format Date, Patient ID, DoctorID, isValid
    public String toString(){
        return this.recName + "\nPatient ID: " + this.patientID.toString() + "\nDoctor ID: " + this.doctorID.toString();
    }
}
