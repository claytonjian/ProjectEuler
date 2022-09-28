package projecteuler;

public class Problem33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator = 1, denominator = 1;
		for(int i = 10; i < 100; i++) {
			for(int j = i + 1; j < 100; j++) {
				boolean numbersWork = false;
				if(i / 10 == j / 10) {
					numbersWork = checkNumbers(i, j, (i % 10), (j % 10), (i / 10));
				}
				if(i % 10 == j / 10) {
					numbersWork = checkNumbers(i, j, (i / 10), (j % 10), (i % 10));
				}
				if(i / 10 == j % 10) {
					numbersWork = checkNumbers(i, j, (i % 10), (j / 10), (i / 10));
				}
				if(i % 10 == j % 10) {
					numbersWork = checkNumbers(i, j, (i / 10), (j / 10), (i % 10));
				}
				if(numbersWork) {
					numerator *= i;
					denominator *= j;
				}
			}
		}
		int factor = 2;
		while(factor <= numerator) {
			while(numerator % factor == 0 && denominator % factor == 0) {
				numerator /= factor;
				denominator /= factor;
			}
			factor++;
		}
		System.out.println(denominator);
	}
	public static boolean checkNumbers(int a, int b, int c, int d, int removedNumber) {
		double threshold = 0.000001;
		double fraction1 = 0, fraction2 = 0;
		if(b != 0) fraction1 = (double)a/b;
		if(d != 0) fraction2 = (double)c/d;
		if(Math.abs(fraction2 - fraction1) < threshold && removedNumber != 0) {
			return true;
		}
		return false;
	}

}
