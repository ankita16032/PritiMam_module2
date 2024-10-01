package module2;

import java.util.Scanner;

public class Student {

	private int rollNo;
	private String name;
	private double score;
	
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter roll no: ");
		rollNo=sc.nextInt();
		
		System.out.println("Enter Name: ");
		name=sc.next();
		
		System.out.println("Enter Score: ");
		score=sc.nextInt();
	}
	public void attendClass()
	{
		System.out.println("Attending class");
	}
	public void apperExam()
	{
		System.out.println("appearing for the exams..");
	}
	public void completeAssignments()
	{
		System.out.println("Completing the assignments");
	}
	public void display()
	{
		System.out.println("rollno is: "+rollNo);
		System.out.println("Name is: "+name);
		System.out.println("Score is: "+score);
	}

}
