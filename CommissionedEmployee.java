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
public class CommissionedEmployee extends Employee{
    double sales;
    //double weeklyPay;
    
    public CommissionedEmployee(String name, double sales) {
        super(name);
        setSales(sales);
        
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getWeeklyPay() {
        return round(sales*20/100);
    }
    
    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s$%-15.2f%-14s$%-15.2f", getName(), "Commissioned", " ", getSales(), " ", getWeeklyPay());
        //return String.format(name + " " +type + " " + sales +" "+ getWeeklyPay()) ;
    }

    @Override
    public double getPayment() {
        return getWeeklyPay();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
