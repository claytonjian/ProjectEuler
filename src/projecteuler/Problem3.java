package projecteuler;

import java.math.BigInteger;

public class Problem3 {

	public static void main(String[] args) {
		BigInteger number = BigInteger.valueOf(600851475143l);
		BigInteger biggestPrime = BigInteger.valueOf(2);
		BigInteger factor = BigInteger.valueOf(2);
		while(!factor.equals(number)) {
			while(number.mod(factor).equals(BigInteger.ZERO)) {
				number = number.divide(factor);
				System.out.println(number);
			}
			factor = factor.add(BigInteger.ONE);
			biggestPrime = factor;
		}
		System.out.println(biggestPrime);
	}
}
