package com.employeewagecomputation;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private String company;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    public EmployeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeWage() {
        int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
            System.out.println("Day#: " + totalWorkingDays + " Emp hrs: " + totalEmpHours);
        }
        totalEmpWage = totalEmpHours * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total wage for company " + company + " is: " + totalEmpWage;
    }


    public static void main(String[] args) {
        EmployeeWageBuilder tataGroup = new EmployeeWageBuilder("Tata Group", 20, 24, 100);
        EmployeeWageBuilder google = new EmployeeWageBuilder("Google", 60, 20, 90);
        tataGroup.computeWage();
        System.out.println(tataGroup);
        google.computeWage();
        System.out.println(google);
    }
}