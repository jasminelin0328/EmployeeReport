/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming.EmployeePayReport;

import java.util.Scanner;

/**
 *
 * @author jasminelin
 */
public class Employee {
    String name;
    String type;
    double weeklyPay;
 
    
    

public Employee(String name, String type){
    this.name = name;
    this.type = type;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
