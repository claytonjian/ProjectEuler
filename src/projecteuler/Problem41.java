package projecteuler;

public class Problem41 {
	static int largestPandigitalPrime = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number = "987654321";
		for(int i = 0; i < number.length(); i++) {
			permutation("", number.substring(i));
		}
		System.out.println(largestPandigitalPrime);
	}
	public static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	if(isPrime(Integer.parseInt(prefix))) {
	    		if(largestPandigitalPrime < Integer.parseInt(prefix)) {
	    			largestPandigitalPrime = Integer.parseInt(prefix);
	    		}
	    	}
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
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
	public static boolean isPandigital(String num) {
		String numbers = "123456789";
		for(int i = 0; i < num.length(); i++) {
			if(!num.contains(numbers.charAt(i) + "")) {
				return false;
			}
		}
		return true;
	}
}
