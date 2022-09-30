package projecteuler;

public class Problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numString;
		boolean allPrime;
		int numOfCircularPrimes = 1;
		for(int i = 3; i < 1000000; i+=2) {
			numString = i + "";
			allPrime = true;
			for(int j = 0; j < numString.length(); j++) {
				if(!isPrime(Integer.parseInt(numString))) {
					allPrime = false;
					break;
				}
				else {
					numString = numString.substring(1, numString.length()) + numString.substring(0, 1);
				}
			}
			if(allPrime) {
				numOfCircularPrimes += 1;
			}
		}
		System.out.println(numOfCircularPrimes);
	}
	public static boolean isPrime(int num) {
		for(int i = 2; i <= (int)Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
