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
public class EmergencyContact {
    
    private String name;
    private String relationship;
    private int homePhone;
    private int mobilePhont;
    private int workPhone;
    
    public EmergencyContact(){
        this.name = "";
        this.relationship = "";
        this.homePhone = 0;
        this.mobilePhont = 0;
        this.workPhone = 0;
    }
    
     public EmergencyContact(String n, String re, int hp, int mp, int wp){
        this.name = n;
        this.relationship = re;
        this.homePhone = hp;
        this.mobilePhont = mp;
        this.workPhone = wp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
    }

    public int getMobilePhont() {
        return mobilePhont;
    }

    public void setMobilePhont(int mobilePhont) {
        this.mobilePhont = mobilePhont;
    }

    public int getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(int workPhone) {
        this.workPhone = workPhone;
    }
    
    
    
}
