package com.intellijide.employeewagecomputation;

public class EmployeeWageBuilder {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("---------------------------------------------");
        int empPresent = (int)Math.floor(Math.random() * 10) % 3;
        int empWage = 0;
        if(empPresent == 1) {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present as Full Time");
        }else if(empPresent == 2){
            System.out.println("Employee is Present as Part Time");
            empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
        }else
            System.out.println("Employee is absent");

        System.out.println("Employee Daily Wage => " +empWage);
    }
}
