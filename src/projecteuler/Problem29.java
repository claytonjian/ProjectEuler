package projecteuler;

import java.math.BigInteger;
import java.util.HashMap;

public class Problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger exponent = BigInteger.ONE;
		HashMap<BigInteger, Integer> numbers = new HashMap<BigInteger, Integer>();
		int index = 0;
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j <=100; j++) {
				exponent = BigInteger.valueOf(i).pow(j);
				numbers.put(exponent, index++);
			}
		}
		System.out.println(numbers.size());
	}

}
