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
public class Receipt {
    
    private int merchantID;
    private int transactionNumber;
    private int lastFourDebitCard;
    private Year date;
    private String cardHolderName;
    private ClinicID reciptId;
    private double amount;
    public Receipt(){
        
    }

    public int getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(int merchantID) {
        this.merchantID = merchantID;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getLastFourDebitCard() {
        return lastFourDebitCard;
    }

    public void setLastFourDebitCard(int lastFourDebitCard) {
        this.lastFourDebitCard = lastFourDebitCard;
    }

    public Year getDate() {
        return date;
    }

    public void setDate(Year date) {
        this.date = date;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public ClinicID getId() {
        return this.reciptId;
    }

    public void setId(ClinicID id) {
        this.reciptId = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
