package projecteuler;

public class Problem24 {
	static String permutations[] = new String[3628800];
	static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int permNum = 0;
		permutation("0123456789");
		System.out.println(permutations[999999]);
	} 
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	public static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	permutations[index++] = prefix;
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
