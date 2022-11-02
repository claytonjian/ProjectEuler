package projecteuler;

import java.math.BigInteger;

public class Problem53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfExceedsMillion = 0;
		for(int n = 1; n <= 100; n++) {
			for(int r = 0; r <= n; r++) {
				if(factorial(n).divide(factorial(r)).divide(factorial(n - r)).compareTo(BigInteger.valueOf(1000000)) == 1) {
					numberOfExceedsMillion++;
				}
			}
		}
		System.out.println(numberOfExceedsMillion);
	}
	public static BigInteger factorial(int num) {
		if(num == 0) {
			return BigInteger.ONE;
		}
		else {
			return BigInteger.valueOf(num).multiply(factorial(num - 1));
		}
	}
}
