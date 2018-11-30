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
public class EMIS {
    
    private ClinicSystem System;
    private InsuranceSystem insuranceSystem;
    private ArrayList<Lab> labWork;
    private ThirdPartyClinicSystem otherClinic;
    
    
    public EMIS(){
        
    }

    public ClinicSystem getSystem() {
        return System;
    }

    public void setSystem(ClinicSystem System) {
        this.System = System;
    }

    public InsuranceSystem getInsuranceSystem() {
        return insuranceSystem;
    }

    public void setInsuranceSystem(InsuranceSystem insuranceSystem) {
        this.insuranceSystem = insuranceSystem;
    }

    public ArrayList<Lab> getLabWork() {
        return labWork;
    }

    public void setLabWork(ArrayList<Lab> labWork) {
        this.labWork = labWork;
    }

    public ThirdPartyClinicSystem getOtherClinic() {
        return otherClinic;
    }

    public void setOtherClinic(ThirdPartyClinicSystem otherClinic) {
        this.otherClinic = otherClinic;
    }
    
}
