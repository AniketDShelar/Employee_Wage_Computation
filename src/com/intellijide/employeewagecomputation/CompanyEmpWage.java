package com.intellijide.employeewagecomputation;

public class CompanyEmpWage {
    private final String companyName;
    final int empWagePerHour;
    final int numOfWorkingDays;
    final int maxHoursPerMonth;
    private int totalEmpWage;

    public CompanyEmpWage(String companyName, int empWagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    public String toString(){
        return "Total Emp wage for company " +companyName+ " is : " +totalEmpWage;
    }
}

