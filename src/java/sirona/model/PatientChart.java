/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;

/**
 *
 * @author jacin
 */
public class PatientChart {
    
    private MedicalHistory history;
    private ArrayList<Diagnosis> dia;
    private ArrayList<Perscription> per;
    private String doctorNotesPath;
    
    public PatientChart(){
        
    }

    public MedicalHistory getHistory() {
        return history;
    }

    public void setHistory(MedicalHistory history) {
        this.history = history;
    }

    public ArrayList<Diagnosis> getDia() {
        return dia;
    }

    public void setDia(ArrayList<Diagnosis> dia) {
        this.dia = dia;
    }

    public ArrayList<Perscription> getPerscription() {
        return this.per;
    }

    public void setPer(ArrayList<Perscription> pers) {
        this.per = pers;
    }

    public String getDoctorNotesPath() {
        return doctorNotesPath;
    }

    public void setDoctorNotesPath(String doctorNotesPath) {
        this.doctorNotesPath = doctorNotesPath;
    }
    
    
}
