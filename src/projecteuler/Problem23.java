package projecteuler;

import java.util.ArrayList;

public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		for(int i = 1; i <= 28123; i++) {
			if(isAbundant(i)) {
				abundantNums.add(i);
			}
		}
	}
	public static boolean isAbundant(int num) {
		if(sumOfProperDivisors(num) > num) {
			return true;
		}
		return false;
	}
	public static int sumOfProperDivisors(int num) {
		int sum = 0;
		for(int i = 1; i <= (int)Math.sqrt(num); i++) {
			if(num % i == 0) {
				sum += i + (num/i);
			}
			if(i * i == num) {
				sum /= i;
			}
		}
		sum -= num;
		return sum;
	}
}
