package module2;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("Calling method....");
		student.accept();
		student.display();
		student.attendClass();
		student.apperExam();
		student.completeAssignments();

		Student student1 = new Student();
		System.out.println("Calling method....");
		// student1.accept();//gives default value
		student1.display();
		student1.attendClass();
		student1.apperExam();
		student1.completeAssignments();
	}

}
