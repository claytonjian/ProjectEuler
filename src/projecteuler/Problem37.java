package projecteuler;

public class Problem37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 10, numOfPrimes = 0, sum = 0;
		while(numOfPrimes != 11) {
			String numString = counter + "";
			boolean allPrime = true;
			for(int i = 0; i < numString.length(); i++) {
				if(!isPrime(Integer.parseInt(numString.substring(i))) || !isPrime(Integer.parseInt(numString.substring(0, numString.length() - i)))) {
					allPrime = false;
					break;
				}
			}
			if(allPrime) {
				sum += counter;
				numOfPrimes++;
				System.out.println(counter);
			}
			counter++;
		}
		System.out.println(sum);
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
