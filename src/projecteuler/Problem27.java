package projecteuler;

public class Problem27 {

	public static void main(String[] args) {
		int a = 0, b = 0, longestSequence = 0;
		for(int i = 2; i <= 1000; i++) {
			for(int j = -1000; j <= 1000; j++) {
				int sequence = findLongestSequence(j, i);
				if(sequence > longestSequence) {
					longestSequence = sequence;
					a = j;
					b = i;
				}
			}
		}
		System.out.println(a * b);
	}
	public static boolean isPrime(int num) {
		boolean prime = true;
		if(num < 2) {
			return false;
		}
		int counter = 2;
		while(counter < num){
			if(num % counter == 0) {
				return false;
			}
			counter++;
		}
		return prime;
	}
	public static int findLongestSequence(int a, int b) {
		int n = 0;
		while(isPrime((int)(Math.pow(n, 2)) + a * n + b)) {
			n++;
		}
		return n;
	}
}
