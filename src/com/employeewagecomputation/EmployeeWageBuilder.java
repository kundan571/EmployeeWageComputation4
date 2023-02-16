package com.employeewagecomputation;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static int computeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)

    {
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
            System.out.println("Day: " + totalWorkingDays + " Emp hrs: " + totalEmpHours);
        }
        int totalEmpWage = totalEmpHours * empRatePerHour;
        System.out.println("Total wage for company: "+ company + " is " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeWage("Tata Groups", 20, 24, 100);
        computeWage("Google", 60, 20, 90);
    }
}