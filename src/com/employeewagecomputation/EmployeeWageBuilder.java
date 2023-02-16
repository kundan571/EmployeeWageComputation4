package com.employeewagecomputation;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_Full_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_Full_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}