/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

/**
 *
 * @author Jacinto Molina
 */
public class BillingInformation {
    
    private String name;
    private int cardNumber;
    private String billingAddress;
   
    
    public BillingInformation(String pName, int pCardNumber, String pBillingAddress){
        this.name = pName;
        this.cardNumber = pCardNumber;
        this.billingAddress = pBillingAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    
}
