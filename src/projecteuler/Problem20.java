package projecteuler;

import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger number = BigInteger.ONE;
		for(int i = 2; i <= 100; i++) {
			number = number.multiply(BigInteger.valueOf(i));
		}
		BigInteger sum = BigInteger.ZERO;
		while(!number.equals(BigInteger.ZERO)) {
			sum = sum.add(number.mod(BigInteger.valueOf(10)));
			number = number.divide(BigInteger.valueOf(10));
		}
		System.out.println(sum);
	}

}
