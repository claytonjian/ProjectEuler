package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem47 {

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
		int sequenceCount = 0;
		int counter = 210;
		while(sequenceCount != 4 && counter < 1000000) {
			int primeCount = 0;
			int factorCounter = 2;
			int arrayCounter = 0;
			int counterTemp = counter;
			while(factorCounter < 1000000 && counterTemp != 1) {
				if(primes[factorCounter]) {
					boolean divisible = false;
					if(counterTemp % factorCounter == 0) {
					}
					while(counterTemp % factorCounter == 0) {
						divisible = true;
						counterTemp /= factorCounter;
					}
					if(divisible) {
						primeCount++;
					}
				}
				if(counterTemp == 1 && primeCount == 4) {
					break;
				}
				else if(primeCount == 5) {
					break;
				}
				arrayCounter++;
				factorCounter = primeNums.get(arrayCounter);
				
			}
			if(primeCount == 4) {
				sequenceCount++;
			}
			else {
				sequenceCount = 0;
			}
			counter++;
		}
		System.out.println(counter - 4);
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
