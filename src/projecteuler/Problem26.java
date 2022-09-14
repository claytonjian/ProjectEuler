package projecteuler;

import java.math.BigInteger;

public class Problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 1;
		int longestCycle = 0;
		for(int i = 2; i < 1000; i++) {
			int denom = i;
			while(denom % 2 == 0 || denom % 5 == 0) {
				if(denom % 2 == 0) {
					denom /= 2;
				}
				else {
					denom /= 5;
				}
			}
			BigInteger nineString = BigInteger.valueOf(9);
			int digits = 1;
			while(!(nineString.mod(BigInteger.valueOf(denom)).equals(BigInteger.ZERO))) {
				nineString = nineString.add(BigInteger.valueOf(9).multiply(BigInteger.valueOf(10).pow(digits))) ;
				digits++;
			}
			if(digits > longestCycle) {
				System.out.println("Digits: " + digits);
				longestCycle = digits;
				d = i;
			}
		}
		System.out.println(d);
	}

}
