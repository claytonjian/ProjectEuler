package projecteuler;

import java.math.BigInteger;

public class Problem48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = BigInteger.ZERO;
		for(int i = 1; i <= 1000; i++) {
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		System.out.println(sum.mod(BigInteger.valueOf(10000000000l)));
	}

}
