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
public class HourlyEmployee extends Employee {

    double hourlyPay;
    int hours;
    //double weeklyPay;

    public HourlyEmployee(String name, double hourlyPay, int hours) {
        super(name);
        setHourlyPay(hourlyPay);
        setHours(hours);
    }
//getter and setter are not always needed, these are for outsider to do setting,
//they can be regarded as a inspection line, check how outsider set and get  
//public parameter is not a good way to let outsider access the class, 
//that they can easily type class.paramete to know the design of class
    public double getHourlyPay() { 
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWeeklyPay() {
        double doublePay = 0;
        if (hours > 40) {
            doublePay = hourlyPay * 2 * (hours - 40);
            return round(hourlyPay * 40 + doublePay);
        } else {
            return round(hourlyPay * hours);
        }

    }
    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15d%-15s$%-14.2f$%-15.2f",getName(), "HourlyEmplyee", getHours()," ",getHourlyPay(), getWeeklyPay()) ;
    }

    @Override
    public double getPayment() {
        return getWeeklyPay();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
