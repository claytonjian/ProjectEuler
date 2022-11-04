package projecteuler;

import java.math.BigInteger;

public class Problem56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largestSum = 0;
		for(int a = 1; a < 100; a++) {
			for(int b = 1; b < 100; b++) {
				BigInteger currentNum = (BigInteger.valueOf(a).pow(b));
				int sum = 0;
				String numberString = currentNum + "";
				for(int i = 0; i < numberString.length(); i++) {
					sum += Integer.parseInt(numberString.substring(i, i + 1));
				}
				if(sum > largestSum) {
					largestSum = sum;
				}
			}
		}
		System.out.println(largestSum);
	}

}
