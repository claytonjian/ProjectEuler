package projecteuler;

import java.util.Arrays;

public class Problem52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100000;
		boolean conditionMet = false;
		String multiples[] = new String[6];
		while(!conditionMet) {
			boolean permutationIsValid = true;
			multiples[0] = "" + number;
			for(int i = 1; i < multiples.length; i++) {
				int temp = number * (i + 1);
				if(!arePermutations(multiples[0], temp + "")) {
					permutationIsValid = false;
					break;
				}
			}
			if(permutationIsValid) {
				conditionMet = true;
			}
			number++;
		}
		number--;
		System.out.println(number);
	}

	static boolean arePermutations(String str1, String str2)
	{
	    // Get lengths of both strings
	    int n1 = str1.length();
	    int n2 = str2.length();
	 
	    // If length of both strings is not same,
	    // then they cannot be Permutation
	    if (n1 != n2)
	    return false;
	    char ch1[] = str1.toCharArray();
	    char ch2[] = str2.toCharArray();
	 
	    // Sort both strings
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	 
	    // Compare sorted strings
	    for (int i = 0; i < n1; i++)
	    if (ch1[i] != ch2[i])
	        return false;
	 
	    return true;
	}
}
