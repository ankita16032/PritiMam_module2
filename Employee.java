package module2;

import java.util.Scanner;

public class Employee {

	private int empNo;
	private String name;
	private double empSalary;

	Scanner sc = new Scanner(System.in);

	public void accept() {

		System.out.println("Enter emp no: ");
		empNo = sc.nextInt();

		System.out.println("Enter Name: ");
		name = sc.next();

		System.out.println("Enter emp salary: ");
		empSalary = sc.nextInt();
	}

	public void completeProject() {
		System.out.println("I have done project..");
	}

	public void checkAttendance() {
		System.out.println("My attendance is 100%!!!");
	}

	public void applyLoan() {
		System.out.println("You can apply for the loan..");
	}

	public void display() {
		System.out.println("empno is: " + empNo);
		System.out.println("Name is: " + name);
		System.out.println("empSalary is: " + empSalary);
	}

}
