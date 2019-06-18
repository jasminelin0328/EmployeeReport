/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming.EmployeePayReport;

import static java.lang.Math.round;

/**
 *
 * @author jasminelin
 */
public class SalariedEmployee extends Employee {

    //Double weeklyPay;
    String bonus;

    public SalariedEmployee(String name, String type, double weeklyPay,String bonus) {
        super(name, type);
        setWeeklyPay(weeklyPay);
        setBonus(bonus);
    }

    public Double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(Double weeklyPay) {
        this.weeklyPay = round(weeklyPay * 100) / 100;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s%-15s%-15s$%.2f%s", getName(), getType(), " ", " ", " ", getWeeklyPay(), getBonus());
        
    }

   
}
