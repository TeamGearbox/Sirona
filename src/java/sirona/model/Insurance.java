/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

/**
 *
 * @author jacin
 */
public class Insurance {
 
    private String name;
    private double coPay;
    private String coverage;
    private IndieProfile InsuranceInfo;
    
    
    public Insurance(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoPay() {
        return coPay;
    }

    public void setCoPay(double coPay) {
        this.coPay = coPay;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public IndieProfile getInsuranceInfo() {
        return InsuranceInfo;
    }

    public void setInsuranceInfo(IndieProfile InsuranceInfo) {
        this.InsuranceInfo = InsuranceInfo;
    }
    
}
