package projecteuler;

import java.math.BigInteger;

public class Problem15 {

	public static void main(String[] args) {
		// This is a permutation with repetitions question, simply do ((2n)!)/((n - r)!(r!))
		BigInteger paths = BigInteger.ONE;
		for(int i = 21; i <= 40; i++) {
			paths = paths.multiply(BigInteger.valueOf(i));
		}
		for(int i = 2; i <= 20; i++) {
			paths = paths.divide(BigInteger.valueOf(i));
		}
		System.out.println(paths);
	}

}
