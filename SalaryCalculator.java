//Write a program to calculate the salary of a person (basic + allowances – deductions like this 5 attributes).

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Other Allowances: ");
        double allowance = sc.nextDouble();

        System.out.print("Enter Deductions: ");
        double deduction = sc.nextDouble();

        double netSalary = basic + hra + da + allowance - deduction;

        System.out.println("Net Salary = " + netSalary);
        sc.close();
    }
}