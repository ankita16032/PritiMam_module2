package module2;

import java.util.Scanner;

public class Cdac {

	private String collegeName;
	private String studentName;
	private int studentId;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter roll no: ");
		collegeName = sc.next();

		System.out.println("Enter Name: ");
		studentName = sc.next();

		System.out.println("Enter Score: ");
		studentId = sc.nextInt();

	}

	public void display() {

		System.out.println("rollno is: " + collegeName);
		System.out.println("Name is: " + studentName);
		System.out.println("Score is: " + studentId);
	}

	public void checkAttendance() {
		System.out.println("Attendance is 100%...");
	}

	public void showInTime() {
		System.out.println("show in time");
	}

	public void showOutTime() {
		System.out.println("show Out time");
	}

	public void showResult() {
		System.out.println("Result will be show here...");
	}

}
