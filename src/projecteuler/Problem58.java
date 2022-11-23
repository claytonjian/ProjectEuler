package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double primePercentage = 1;
		int i = 1;
		int diagonals = 1;
		int primes = 0;
		while(primePercentage >= 0.1) {
			if(isPrime((int)(Math.pow((2 * i + 1), 2)))) {
				primes++;
			}
			if(isPrime((int)(Math.pow((2 * i + 1), 2)) - 6 * i)) {
				primes++;
			}
			if(isPrime((int)(Math.pow((2 * i + 1), 2)) - 2 * i)) {
				primes++;
			}
			if(isPrime((int)(Math.pow((2 * i + 1), 2)) - 4 * i)) {
				primes++;
			}
			diagonals += 4;
			primePercentage = ((double)primes/(double)diagonals);
			i++;
		}
		System.out.println(i-- * 2 + 1);
	}
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i = 2; i <= (int)Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
