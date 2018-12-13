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
    private ClinicID senderID;

    
    public Inbox(){
        
    }

    public ArrayList<File> getMessageBox() {
        return messageBox;
    }

    public void setMessageBox(ArrayList<File> messageBox) {
        this.messageBox = messageBox;
    }

    
    public ClinicID getSenderID() {
        return senderID;
    }

    public void setSenderID(ClinicID senderID) {
        this.senderID = senderID;
    }

}