package com.intellijide.employeewagecomputation;

public class EmployeeWageBuilder {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int WORKING_HOURS_PER_MONTH = 100;

    public static int calculateEmpWage(int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int WORKING_HOURS_PER_MONTH) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("---------------------------------------------");
        int totatWage = 0;
        int totalWorkingHours = 0;
        int dayCount = 1;
        int workingHours = 0;
        while (dayCount <= WORKING_DAYS_PER_MONTH && workingHours <= WORKING_HOURS_PER_MONTH) {
            int empWage = 0;
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;
            switch (empPresent) {
                case IS_PART_TIME:
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee is Present as Full Time");
                    workingHours += FULL_DAY_HOUR;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as Part Time");
                    empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    workingHours += PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            totatWage += empWage;
            System.out.println("Employee Daily Wage Day " + dayCount + " => " + empWage);
            dayCount++;
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Working Hours => " + workingHours);
        System.out.println("Total wage => " + totatWage);
        return totatWage;
    }
    public static void main(String[] args) {
        calculateEmpWage(20,20,75);
    }
}
