/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balexcompany;

/**
 *
 * @author HP
 */
public class Balexcompany {

    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < 8.0) {
            System.out.println("Error: Base pay must be at least $8.00 per hour.");
            return;
        }

        if (hoursWorked > 60) {
            System.out.println("Error: Employee cannot work more than 60 hours per week.");
            return;
    }

        }

        double regularPay = basePay * Math.min(hoursWorked, 40);
        int overtimeHours = Math.max(hoursWorked - 40, 0);
        double overtimePay = overtimeHours * basePay * 1.5;
        double totalPay = regularPay + overtimePay;

        System.out.println("Total Pay: $" + totalPay);
    public static void main(String[] args) {
        calculatePay(10.0, 40);  // Employee 1: Regular hours
        calculatePay(10.0, 45);  // Employee 2: Overtime
        calculatePay(7.5, 50);  // Employee 3: Below minimum wage (error)
        calculatePay(8.0, 65);  // Employee 4: Exceeds maximum hours (error)
    }
}


