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
public class Perscription {
    
    private String name;
    private String time;
    private String ml;
    private String directions;
    private int refills;
    
    public Perscription(){
        this.name = "";
        this.time = "";
        this.ml = "";
        this.directions = "";
        this.refills = 0;
    }
    
    public Perscription(String n, String t, String m,String d, int re){
        this.name = n;
        this.time = t;
        this.ml = m;
        this.directions = d;
        this.refills = re;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public int getRefills() {
        return refills;
    }

    public void setRefills(int refills) {
        this.refills = refills;
    }
    
    
    
}
