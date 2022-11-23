package projecteuler;

import java.math.BigInteger;

public class Problem57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger numerator = BigInteger.valueOf(3);
		BigInteger denominator = BigInteger.valueOf(2);
		int largerNumerators = 0;
		for(int i = 0; i < 999; i++) {
			numerator = numerator.add(denominator.multiply(BigInteger.valueOf(2)));
			denominator = numerator.subtract(denominator);
			if((numerator.toString()).length() > (denominator.toString()).length()) {
				largerNumerators++;
			}
		}
		System.out.println(largerNumerators);
	}

}
