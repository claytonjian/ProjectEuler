package projecteuler;

public class Problem5 {

	public static void main(String[] args) {
		long number = 1;
		int primes[] = {2, 3, 5, 7, 11, 13, 17, 19};
		for(int i = 2; i <= 20; i++) {
			while(number % i != 0) {
				for(int j = 0; j < primes.length; j++) {
					if(number * primes[j] % i == 0) {
						number *= primes[j];
						break;
					}
				}
			}
		}
		System.out.println(number);
	}
}
