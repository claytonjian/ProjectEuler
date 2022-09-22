package projecteuler;

import java.util.ArrayList;

public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abundantNums[] = new int[20000];
		int index = 0;
		long totalSum = 0;
		for(int i = 0; i < 28124; i++) {
			if(isAbundant(i)) {
				abundantNums[index++] = i;
			}
		}
		boolean allowedNums[] = new boolean[28124];
		for(int i = 0; abundantNums[i] != 0; i++) {
			for(int j = 0; abundantNums[j] != 0; j++) {
				if(abundantNums[i] + abundantNums[j] < 28124) {
					allowedNums[abundantNums[i] + abundantNums[j]] = true;
				}
			}
		}
		for(int i = 0; i < allowedNums.length; i++) {
			if(!allowedNums[i]) {
				totalSum += i;
			}
		}
		System.out.println(totalSum);
	}
	public static boolean isAbundant(int num) {
		if(sumOfProperDivisors(num) > num) {
			return true;
		}
		return false;
	}
	public static int sumOfProperDivisors(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
