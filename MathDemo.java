package module2;

public class MathDemo {

	public static void main(String[] args) {

		System.out.println(Math.sqrt(169)); // 13
		System.out.println(Math.abs(-88)); // +ve no 88
		System.out.println(Math.min(12, 90)); // min 12
		System.out.println(Math.max(35, 97)); // max 95
		System.out.println("no is : " + Math.random()); // generates no between 0 to 1
		double d = (int) (Math.random() * 1000); // generates no between 0 to 1000
		System.out.println("d is : " + d);
		System.out.println(Math.ceil(579.12)); // 580
		System.out.println(Math.floor(965.54)); // 965
		System.out.println(Math.random());
		System.out.println(Math.pow(5, 3)); // 125

		System.out.println(Math.addExact(12, 20));
		System.out.println(Math.divideExact(24, 5));

	}

}
