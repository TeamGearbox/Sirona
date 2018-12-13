/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import sirona.model.StaticClasses.StaffType;

/**
 *
 * @author Jacinto Molina
 */
public class StaffProfile extends Profile{
    
    private StaffType type;

    public StaffProfile(StaffType type, String name, int phone, ClinicID clinicId, int mobilePhone, String email, Inbox inbox) {
        super(name, phone, clinicId, mobilePhone, email, inbox);
        this.type = type;
    }
    
    public StaffProfile(StaffType ty){
        super();
        this.type = ty;
    }
    

    public StaffType getType() {
        return type;
    }

    public void setType(StaffType type) {
        this.type = type;
    }
    
}
