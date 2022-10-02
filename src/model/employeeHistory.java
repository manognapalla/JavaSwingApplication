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
public class employeeHistory {
    private ArrayList<employee> history;
    
    public employeeHistory(){
        this.history = new ArrayList<employee>();
        
    }

    public ArrayList<employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<employee> history) {
        this.history = history;
    }
    
    public employee addNewEmployee(){
        
        employee newEmployee = new employee();
        history.add(newEmployee);
        return newEmployee;
        
    }

    public void deleteemployee(employee emp) {
        history.remove(emp);
     }
}
