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
public class EmployeePayReport {
    //private static int row;
    private static Employee report[];

    
    public static void main(String[] args) {
        report = new Employee[5];
            for (int i = 0; i < report.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Type 1 for salaried, 2 for hourly, 3 for commisioned: ");
            int type = in.nextInt();
            if (type == 1) {
                System.out.print("WeeklyPay: ");
                double weeklyPay = in.nextDouble();
                Scanner input = new Scanner(System.in);
                System.out.print("10% bonus awarded? y for yes, n for no: ");
                String answer = input.nextLine();
                if (answer.equals("y")) {

                    weeklyPay = weeklyPay * 1.1;
                    SalariedEmployee emp = new SalariedEmployee(name, weeklyPay, "*");
                    report[i] = emp;
                } else {
                    SalariedEmployee emp = new SalariedEmployee(name, weeklyPay, "");
                    report[i] = emp;
                }
            } else if (type == 2) {
                System.out.print("HourlyPay: ");
                double hourlyPay = in.nextDouble();
                System.out.print("Hours: ");
                int hours = in.nextInt();
                HourlyEmployee emp = new HourlyEmployee(name, hourlyPay, hours);
                report[i] = emp;
            } else if (type == 3) {
                System.out.print("Sales: ");
                double sales = in.nextDouble();
                CommissionedEmployee emp = new CommissionedEmployee(name, sales);
                report[i] = emp;
            }

        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "Name", "Class", "Hours", "Sales", "Rate", "Weekly Pay");
        System.out.println("=======================================================================================");
        double total = 0;
        for (int i = 0; i < report.length; i++) {
            System.out.println(report[i]);
            total = total + report[i].getPayment();
        }
        System.out.println("=======================================================================================");
        System.out.printf("Total $%.2f%n", total);
        System.out.println("*A 10% bonus is awarded");

    }
}
