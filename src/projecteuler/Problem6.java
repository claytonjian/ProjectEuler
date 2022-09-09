package projecteuler;

import java.math.BigInteger;

public class Problem6 {

	public static void main(String[] args) {
		BigInteger sumSquareDifference = BigInteger.ZERO, sumOfSquares = BigInteger.ZERO, squareOfSums = BigInteger.ZERO;
		for(int i = 1; i <= 100; i++) {
			sumOfSquares = sumOfSquares.add(BigInteger.valueOf(i * i));
		}
		squareOfSums = BigInteger.valueOf((100 * 101 / 2) * (100 * 101 /2));
		System.out.println(squareOfSums.subtract(sumOfSquares));
	}

}
