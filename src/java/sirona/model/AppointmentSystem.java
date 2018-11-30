/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

import java.util.ArrayList;

/**
 *
 * @author Jacinto Molina
 */
// TODO: Need to update to integrate HASHMAP list.
public class AppointmentSystem {
    
    private ArrayList<Appointment> listOfAppointments;
    
    public AppointmentSystem(){
        this.listOfAppointments = new ArrayList<Appointment>();
    }
    
    public void addAppointment(Appointment app){
        this.listOfAppointments.add(app);
    }
    
    public void removeAppointment(Appointment app){
        this.listOfAppointments.remove(app);
    }

    public Appointment getAppointment(Appointment app){
      
        return StaticClasses.uniqueAppList.get(app.getReciptName());
    }
    
    public ArrayList<Appointment> getListOfAppointments() {
        return listOfAppointments;
    }

    public void setListOfAppointments(ArrayList<Appointment> listOfAppointments) {
        this.listOfAppointments = listOfAppointments;
    }
    
}
