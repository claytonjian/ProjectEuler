package projecteuler;

public class Problem43 {
	
	static long sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("", "0123456789");
		System.out.println(sum);
	}
	public static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	if(satisfiesCondition(prefix)) {
	    		sum += Long.parseLong(prefix);
	    	}
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	public static boolean satisfiesCondition(String num) {
		int divisors[] = {2, 3, 5, 7, 11, 13, 17};
		for(int i = 0; i < divisors.length; i++) {
			if(Long.parseLong(num.substring(i + 1, i + 4)) % divisors[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
