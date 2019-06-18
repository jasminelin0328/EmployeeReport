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

    public HourlyEmployee(String name, String type, double hourlyPay, int hours) {
        super(name, type);
        setHourlyPay(hourlyPay);
        setHours(hours);
    }

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
            weeklyPay = round(hourlyPay * 40 + doublePay);
        } else {
            weeklyPay = round(hourlyPay * hours);
        }
        return weeklyPay;

    }
    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15d%-15s$%-14.2f$%-15.2f",getName(), getType(), getHours()," ",getHourlyPay(), getWeeklyPay()) ;
    }

}
