/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;

/**
 *
 * @author Jacinto Molina
 */
public class ClinicSystem {
    
    private ArrayList<Doctor> doctorList;
    private ArrayList<Nurse> nurseList;
    private ArrayList<Patient> fullPatientList;
    private AppointmentSystem appointSystem;
    private PaymentSystem payment;
    
    public ClinicSystem(){
        this.doctorList = new ArrayList<Doctor>();
        this.nurseList = new ArrayList<Nurse>();
        this.fullPatientList = new ArrayList<Patient>();
        this.appointSystem = new AppointmentSystem();
        this.payment = new PaymentSystem();
    }
       public ClinicSystem(ArrayList<Doctor> docList,ArrayList<Nurse> nurList, ArrayList<Patient> patList, AppointmentSystem ap, PaymentSystem ps){
        
        this.doctorList = docList;
        this.nurseList = nurList;
        this.fullPatientList = patList;
        this.appointSystem = ap;
        this.payment = ps;  
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<Nurse> nurseList) {
        this.nurseList = nurseList;
    }

    public ArrayList<Patient> getFullPatientList() {
        return fullPatientList;
    }

    public void setFullPatientList(ArrayList<Patient> fullPatientList) {
        this.fullPatientList = fullPatientList;
    }

    public AppointmentSystem getAppointSystem() {
        return appointSystem;
    }

    public void setAppointSystem(AppointmentSystem appointSystem) {
        this.appointSystem = appointSystem;
    }

    public PaymentSystem getPayment() {
        return payment;
    }

    public void setPayment(PaymentSystem payment) {
        this.payment = payment;
    }
    
    
    
}
