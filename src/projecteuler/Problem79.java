package projecteuler;

public class Problem79 {
	
	static String permutations[] = new String[40320];
	static int index = 0;
	static String[] codes = {"319", "680", "180", "690", "129", "620", "762", "689", "762", "318", "368", "710", "720", "710", "629", "168", "160", "689", "716", "731", "736", "729", "316", "729", "729", "710", "769", "290", "719", "680", "318", "389", "162", "289", "162", "718", "729", "319", "790", "680", "890", "362", "319", "760", "316", "729", "380", "319", "728", "716"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int permNum = 0;
		permutation("01236789");
		for(int i = 0; i < permutations.length; i++) {
			boolean valid = true;
			for(int j = 0; j < codes.length; j++) {
				int index1 = permutations[i].indexOf(codes[j].charAt(0));
				int index2 = permutations[i].indexOf(codes[j].charAt(1));
				int index3 = permutations[i].indexOf(codes[j].charAt(2));
				if(!(index1 < index2) || !(index2 < index3)) {
					valid = false;
					break;
				}
			}
			if(valid) {
				System.out.println(permutations[i]);
				break;
			}
		}
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
