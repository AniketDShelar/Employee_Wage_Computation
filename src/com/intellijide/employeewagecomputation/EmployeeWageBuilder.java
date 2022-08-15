package com.intellijide.employeewagecomputation;

public class EmployeeWageBuilder {
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    public static int calculateEmpWage(String companyName, int empWagePerHour, int numOfWorkingDays,int maxHoursPerMonth) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("---------------------------------------------");
        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;
            switch (empPresent) {
                case IS_PART_TIME:
                    System.out.println("Employee is present as part time");
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is present as full time");
                    empHours = 8;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHours = 0;
                    break;
            }
            totalEmpHours += empHours;
            System.out.println("Day: " +totalWorkingDays+ " Employee working hours : " +empHours);
        }
        int totalEmpWage = totalEmpHours * empWagePerHour;
        System.out.println("Total Employee wage for company " +companyName+ " is " +totalEmpWage);
        System.out.println("---------------------------------------------");
        return totalEmpWage;
    }
    public static void main(String[] args) {
        calculateEmpWage("Tata",25,25,80);
        calculateEmpWage("Dmart",20,30,90);
        calculateEmpWage("Reliance",25,20,80);
    }
}
