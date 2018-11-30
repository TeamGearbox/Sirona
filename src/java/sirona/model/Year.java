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
public class Year {
    private ArrayList<Month> listOfMonths;
    private int Year;
    
    public Year(int year){
        this.Year = year;
    }

    public ArrayList<Month> getListOfMonths() {
        return listOfMonths;
    }

    public void setListOfMonths(ArrayList<Month> listOfMonths) {
        this.listOfMonths = listOfMonths;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
}
