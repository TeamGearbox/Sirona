/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.awt.Image;
import java.util.ArrayList;
import sirona.model.StaticClasses.*;

/**
 *
 * @author Jacinto Molina
 */
public class Profile {
    
    private String name;
    private int phone;
    private ClinicID clinicId;
    private int mobilePhone;
    private String email;
    private Inbox inbox;

    public Profile(String name, int phone, ClinicID clinicId, int mobilePhone, String email, Inbox inbox) {
        this.name = name;
        this.phone = phone;
        this.clinicId = clinicId;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.inbox = inbox;
    }

    public Profile(){
        this.name = "";
        this.phone = 0;
        this.clinicId = new ClinicID("abc123");
        this.mobilePhone = 0;
        this.email = "";
        this.inbox = new Inbox();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ClinicID getClinicId() {
        return clinicId;
    }

    public void setClinicId(ClinicID clinicId) {
        this.clinicId = clinicId;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }
}
