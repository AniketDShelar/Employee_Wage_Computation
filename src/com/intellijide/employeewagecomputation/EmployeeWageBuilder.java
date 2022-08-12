package com.intellijide.employeewagecomputation;

public class EmployeeWageBuilder {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("---------------------------------------------");
        int empPresent = (int)Math.floor(Math.random() * 10) % 2;
        int empWage = 0;
        if(empPresent == 1) {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present");
        }else
            System.out.println("Employee is Absent");

        System.out.println("Employee Daily Wage => " +empWage);
    }
}
