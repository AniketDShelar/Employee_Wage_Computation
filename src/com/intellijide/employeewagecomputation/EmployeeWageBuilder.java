package com.intellijide.employeewagecomputation;

public class EmployeeWageBuilder {
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    private final String companyName;
    private final int empWagePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmployeeWageBuilder(String companyName, int empWagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int calculateEmpWage() {
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
        EmployeeWageBuilder tata = new EmployeeWageBuilder("Tata",25,25,80);
        EmployeeWageBuilder dmart = new EmployeeWageBuilder("Dmart",20,30,90);
        EmployeeWageBuilder reliance = new EmployeeWageBuilder("Reliance",25,20,80);
        tata.calculateEmpWage();
        dmart.calculateEmpWage();
        reliance.calculateEmpWage();
    }
}
