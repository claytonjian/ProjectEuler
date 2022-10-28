package projecteuler;

public class Problem49 {
	static String permutations[] = new String[24];
	static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = false;
		String number = "";
		for(int i = 1001; i < 10000; i = i + 2) {
			if(i != 1487 && i != 4817 && i != 8147) {
				if(isPrime(i)) {
					index = 0;
					permutations("", i + "");
					for(int j = 0; j < permutations.length; j++) {
						for(int k = j + 1; k < permutations.length; k++) {
							for(int l = k + 1; l < permutations.length; l++) {
								int a = Integer.parseInt(permutations[j]);
								int b = Integer.parseInt(permutations[k]);
								int c = Integer.parseInt(permutations[l]);
								if(a != b && b != c && a != c && Math.abs(b - a) == Math.abs(c - b) && isPrime(a) && isPrime(b) && isPrime(c) && a/1000 > 0 && b/1000 > 0 && c/1000 > 0) {
									done = true;
									number += a + "" + b + "" + c;
									break;
								}
								if(done) break;
							}
							if(done) break;
						}
						if(done) break;
					}
				}
			}
			if(done) break;
		}
		System.out.println(number);
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
	public static void permutations(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	permutations[index++] = prefix;
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
	    }
	}
}
