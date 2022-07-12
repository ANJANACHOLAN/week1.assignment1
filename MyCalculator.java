package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {

		Calculators math = new Calculators();
		math.add(1, 2, 3);
		math.sub(2, 1);
		math.mul(12345.67, 98765.43);
		math.divide(1.2f, 3.4f);

	}

}
