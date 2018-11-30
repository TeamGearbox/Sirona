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
public class PaymentSystem {
    
    private BillingInformation billInfo;
    private ArrayList<ThirdPartyPay> optionOf3rdOParty;
    private Receipt rec;
    
    
    public PaymentSystem(){
        
    }

    public BillingInformation getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(BillingInformation billInfo) {
        this.billInfo = billInfo;
    }

    public ArrayList<ThirdPartyPay> getOptionOf3rdOParty() {
        return optionOf3rdOParty;
    }

    public void setOptionOf3rdOParty(ArrayList<ThirdPartyPay> optionOf3rdOParty) {
        this.optionOf3rdOParty = optionOf3rdOParty;
    }

    public Receipt getRec() {
        return rec;
    }

    public void setRec(Receipt rec) {
        this.rec = rec;
    }
    
}
