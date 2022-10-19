package projecteuler;

public class Problem46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean notDone = true;
		int counter = 9;
		while(notDone) {
			boolean possible = false;
			if(!isPrime(counter)) {
				for(int i = 1; 2 * i * i < counter; i++) {
					int temp = counter - (2 * i * i);
					if(isPrime(temp)) {
						possible = true;
					}
				}
				if(!possible) {
					notDone = false;
					break;
				}
			}
			counter += 2;
		}
		System.out.println(counter);
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
