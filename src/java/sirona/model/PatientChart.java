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
    
    public PatientChart(MedicalHistory H, ArrayList<Diagnosis> d, ArrayList<Perscription> p, String dnp){
        this.history = H;
        this.dia = d;
        this.per = p;
        this.doctorNotesPath = dnp;
    }
     public PatientChart(){
        this.history = new MedicalHistory();
        this.dia = new ArrayList<Diagnosis>();
        this.per = new ArrayList<Perscription>();
        this.doctorNotesPath = "";
    }
     
     public void addPer(Perscription p){
         this.per.add(p);
     }
     
     public void addDia(Diagnosis d){
         this.dia.add(d);
     }
     
     public void removeDia(Diagnosis d){
         this.dia.remove(d);
     }
     
     public void removePer(Perscription p){
         this.per.remove(p);
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
