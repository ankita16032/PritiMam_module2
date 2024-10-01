package module2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.accept();

		employee.display();
		employee.completeProject();
		employee.checkAttendance();
		employee.applyLoan();

		System.out.println("-----------------------------------");

		Employee employee1 = new Employee();
		employee1.accept();
		employee1.display();
		employee1.completeProject();
		employee1.checkAttendance();
		employee1.applyLoan();
	}

}
