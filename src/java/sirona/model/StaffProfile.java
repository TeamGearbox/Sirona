/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import sirona.model.StaticClasses.StaffType;

/**
 *
 * @author jacin
 */
public class StaffProfile {
    
    private StaffType type;
    
    
    public StaffProfile(){
        
    }

    public StaffType getType() {
        return type;
    }

    public void setType(StaffType type) {
        this.type = type;
    }
    
}
