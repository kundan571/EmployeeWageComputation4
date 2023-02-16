package com.employeewagecomputation;

public class CompanyEmployeeWage {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public CompanyEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total wage for company: " + company + " is " + totalEmpWage;
    }
}
