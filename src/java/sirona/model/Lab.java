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
public class Lab {
    
    private IndieProfile profile;
    private ArrayList<String> activeOrders;
    
    public Lab(){
        this.profile = new IndieProfile();
        this.activeOrders = new ArrayList<String>();
    }
     public Lab(ArrayList<String> ac, IndieProfile ip){
        this.profile = ip;
        this.activeOrders = ac;
    }


    public IndieProfile getProfile() {
        return profile;
    }

    public void setProfile(IndieProfile profile) {
        this.profile = profile;
    }

    public ArrayList<String> getActiveOrders() {
        return activeOrders;
    }

    public void setActiveOrders(ArrayList<String> activeOrders) {
        this.activeOrders = activeOrders;
    }
    
}
