package projecteuler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger number = BigInteger.ONE;
		for(int i = 1; i <= 1000; i++) {
			number = number.multiply(BigInteger.valueOf(2));
		}
		int sum = 0;
		for(int i = 0; i < number.toString().length(); i++) {
			sum += Integer.parseInt(number.toString().substring(i, i + 1));
		}
		System.out.println(sum);
	}

}
