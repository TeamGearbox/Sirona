/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author jacin
 */
public class Inbox {
    
    private ArrayList<File> messageBox;
    private String messageType;
    private ClinicID senderID;
    private String subject;
    private int messLimit;
    private ClinicID recieveID;
    
    public Inbox(){
        
    }

    public ArrayList<File> getMessageBox() {
        return messageBox;
    }

    public void setMessageBox(ArrayList<File> messageBox) {
        this.messageBox = messageBox;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public ClinicID getSenderID() {
        return senderID;
    }

    public void setSenderID(ClinicID senderID) {
        this.senderID = senderID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMessLimit() {
        return messLimit;
    }

    public void setMessLimit(int messLimit) {
        this.messLimit = messLimit;
    }

    public ClinicID getRecieveID() {
        return recieveID;
    }

    public void setRecieveID(ClinicID recieveID) {
        this.recieveID = recieveID;
    }
    
}
