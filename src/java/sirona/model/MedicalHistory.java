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
public class MedicalHistory {
    
    private ArrayList<String> allergies;
    private ArrayList<String> vaccinations;
    private boolean isSmoking;
    private boolean isTobaccoUser;
    private ArrayList<String> medicalProblems;
    private ArrayList<String> procedures;
    private ArrayList<String> previousProviders;
    
    public MedicalHistory(){
          this.allergies = new ArrayList<String>();
         this.vaccinations = new ArrayList<String>();
         this.isSmoking = false;
         this.isTobaccoUser = false;
         this.medicalProblems = new ArrayList<String>();
         this.procedures = new ArrayList<String>();
         this.previousProviders = new ArrayList<String>();
    }
     public MedicalHistory(ArrayList<String> al, ArrayList<String> vac, boolean smoking, boolean tobbacco, ArrayList<String> mp, ArrayList<String> pro,ArrayList<String> prov)
     {
         this.allergies = al;
         this.vaccinations = vac;
         this.isSmoking = smoking;
         this.isTobaccoUser = tobbacco;
         this.medicalProblems = mp;
         this.procedures = pro;
         this.previousProviders = prov;
        
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(ArrayList<String> allergies) {
        this.allergies = allergies;
    }

    public ArrayList<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(ArrayList<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public boolean isIsSmoking() {
        return isSmoking;
    }

    public void setIsSmoking(boolean isSmoking) {
        this.isSmoking = isSmoking;
    }

    public boolean isIsTobaccoUser() {
        return isTobaccoUser;
    }

    public void setIsTobaccoUser(boolean isTobaccoUser) {
        this.isTobaccoUser = isTobaccoUser;
    }

    public ArrayList<String> getMedicalProblems() {
        return medicalProblems;
    }

    public void setMedicalProblems(ArrayList<String> medicalProblems) {
        this.medicalProblems = medicalProblems;
    }

    public ArrayList<String> getProcedures() {
        return procedures;
    }

    public void setProcedures(ArrayList<String> procedures) {
        this.procedures = procedures;
    }

    public ArrayList<String> getPreviousProviders() {
        return previousProviders;
    }

    public void setPreviousProviders(ArrayList<String> previousProviders) {
        this.previousProviders = previousProviders;
    }
    
}
