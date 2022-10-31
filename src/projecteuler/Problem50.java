package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean primes[] = new boolean[1000000];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for(int i = 2; i < Math.sqrt(primes.length); i++) {
			if(isPrime(i)) {
				int counter = 2;
				int temp = i * counter;
				while(temp < primes.length) {
					primes[temp] = false;
					counter++;
					temp = i * counter;
				}
			}
		}
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		for(int i = 0; i < primes.length; i++) {
			if(primes[i]) {
				primeNums.add(i);
			}
		}
		boolean primeFound = false;
		int length = 550, numberOfTries = 1;
		while(!primeFound) {
			for(int i = 0; i < numberOfTries; i++) {
				int sum = 0;
				for(int j = i; j < length + 1; j++) {
					sum += primeNums.get(j);
				}
				if(isPrime(sum) && sum < 1000000) {
					System.out.println(sum);
					primeFound = true;
					break;
				}
			}
			numberOfTries++;
			length--;
		}
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
