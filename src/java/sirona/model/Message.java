/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

/**
 *
 * @author monic
 */
public class Message {
    private String messageType;
    private String subject;
    private int messLimit;
    private ClinicID recieveID;

    public Message(String messageType, String subject, int messLimit, ClinicID recieveID) {
        this.messageType = messageType;
        this.subject = subject;
        this.messLimit = messLimit;
        this.recieveID = recieveID;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getSubject() {
        return subject;
    }

    public int getMessLimit() {
        return messLimit;
    }

    public ClinicID getRecieveID() {
        return recieveID;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessLimit(int messLimit) {
        this.messLimit = messLimit;
    }

    public void setRecieveID(ClinicID recieveID) {
        this.recieveID = recieveID;
    }
    
    
}
