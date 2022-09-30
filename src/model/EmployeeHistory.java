/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
public class EmployeeHistory {
    
    private ArrayList<Profile>history;
    
    public EmployeeHistory(){
       this. history= new ArrayList<Profile> ();
       
                
    }

    public ArrayList<Profile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Profile> history) {
        this.history = history;
    }
   
}
