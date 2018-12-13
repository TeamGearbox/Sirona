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

    public boolean patientStatus(Patient patient){
        for(Patient p : fullPatientList){
            if(p.getProfile().getName().equals(patient.getProfile().getName()))
                return true;
        }
        return false;
    }
    
    public boolean doctorStatus(Doctor doctor){
        for(Doctor d : doctorList){
            if(d.getProfile().getName().equals(doctor.getProfile().getName()))
                return true;
        }
        return false;
    }
    
    public boolean nurseStatus(Nurse nurse){
        for(Nurse n : nurseList){
            if(n.getProfile().getName().equals(nurse.getProfile().getName()))
                return true;
        }
        return false;
    }
    
    public void addPatient(Patient patient){
        if(patientStatus(patient) == false)
            fullPatientList.add(patient);
            ClinicID docid = patient.getDoctorID();
            for(Doctor d : doctorList){
                if(d.getProfile().getClinicId().getID().equals(docid.getID()))
                    d.addPatient(patient);
            }
    }
    
    public void addDoctor(Doctor doctor){
        if(doctorStatus(doctor) == false)
            doctorList.add(doctor);
    }
    
    public void addNurse(Nurse nurse){
        if(nurseStatus(nurse) == false)
            nurseList.add(nurse);
    }
    
    public void removePatient(Patient patient){
        if(patientStatus(patient) == true){
            fullPatientList.remove(patient);
            ClinicID docid = patient.getDoctorID();
            for(Doctor d : doctorList){
                if(d.getProfile().getClinicId().getID().equals(docid.getID()))
                    d.removePatient(patient);
            }
        }
    }
    
    public void removeDoctor(Doctor doctor){
        if(doctorStatus(doctor) == true)
            doctorList.remove(doctor);
    }
    
    public void removeNurse(Nurse nurse){
        if(nurseStatus(nurse) == true)
            nurseList.remove(nurse);
    }
    
    public void login(String id, String password){
        // get credentials and verify with database
    }
    
    
}
