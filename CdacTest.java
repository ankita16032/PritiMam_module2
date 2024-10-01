package module2;

public class CdacTest {

	public static void main(String[] args) {
		Cdac cdac = new Cdac();
		System.out.println("show all member functions...");
		cdac.accept();
		cdac.display();
		cdac.checkAttendance();
		cdac.showInTime();
		cdac.showOutTime();
		cdac.showResult();

		Cdac cdac1 = new Cdac();
		System.out.println("show all member functions...");
		cdac1.accept();
		cdac1.display();
		cdac1.checkAttendance();
		cdac1.showInTime();
		cdac1.showOutTime();
		cdac1.showResult();

	}

}
