package projecteuler;

import java.math.BigInteger;

public class Problem63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int possibleNums = 0;
		for(int i = 1; i < 10; i++) {
			for(int j = 0; j < 100; j++) {
				BigInteger exponent = BigInteger.valueOf(i).pow(j);
				if((exponent + "").length() == j) {
					System.out.println(exponent);
					possibleNums++;
				}
			}
		}
		System.out.println(possibleNums);
	}

}
