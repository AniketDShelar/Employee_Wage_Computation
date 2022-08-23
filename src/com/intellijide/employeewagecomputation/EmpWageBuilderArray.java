package com.intellijide.employeewagecomputation;

public class EmpWageBuilderArray {
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilderArray() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String companyName, int empWagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, empWagePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    private void calculateEmpWage() {
        for (int i = 0; i <= numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.calculateEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int calculateEmpWage(CompanyEmpWage companyEmpWage) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("---------------------------------------------");
        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
            System.out.println("Day: " + totalWorkingDays + " Employee working hours : " + empHours);
        }
        return totalEmpHours * companyEmpWage.empWagePerHour;
    }
    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
        empWageBuilderArray.addCompanyEmpWage("Tata", 30, 20, 100);
        empWageBuilderArray.addCompanyEmpWage("DMart", 25, 25, 90);
        empWageBuilderArray.addCompanyEmpWage("Reliance", 25, 25, 85);
        empWageBuilderArray.calculateEmpWage();
    }
}
