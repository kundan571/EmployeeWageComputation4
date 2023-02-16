package com.employeewagecomputation;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompanies = 0;
    private CompanyEmployeeWage[] companyWageArray;

    public EmployeeWageBuilder() {
        companyWageArray = new CompanyEmployeeWage[5];
    }

    private void addCompanies(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyWageArray[numOfCompanies] = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompanies++;
    }

    private void computeWage() {
        for (int i = 0; i < numOfCompanies; i++) {
            companyWageArray[i].setTotalEmpWage(this.computeWage(companyWageArray[i]));
            System.out.println(companyWageArray[i]);
        }
    }

    private int computeWage(CompanyEmployeeWage companyEmpWage) {
        int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHours += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp hrs: " + totalEmpHours);
        }
        return totalEmpHours * companyEmpWage.empRatePerHour;
    }


    public static void main(String[] args) {
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.addCompanies("Tata Groups", 20, 20, 100);
        employeeWageBuilder.computeWage();
    }
}