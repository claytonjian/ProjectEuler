package projecteuler;

import java.math.BigInteger;

public class Problem55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLychrels = 0;
		for(int i = 0; i < 10000; i++) {
			BigInteger sum = BigInteger.valueOf(i);
			for(int j = 1; j < 50; j++) {
				//System.out.print(sum + " + " + reverse(sum.toString()) + " = ");
				sum = sum.add(new BigInteger(reverse(sum.toString() + "")));
				//System.out.println(sum);
				if(isPalindrome(sum + "")) {
					break;
				}
			}
			if(!isPalindrome(sum + "")) {
				numberOfLychrels++;
			}
		}
		System.out.println(numberOfLychrels);
	}
	public static String reverse(String s) {
		String temp = "";
		for(int i = s.length(); i > 0; i--) {
			temp = temp + s.substring(i - 1, i);
		}
		return temp;
	}
	
	public static boolean isPalindrome(String s) {
		boolean palindrome = true;
		for(int i = 0; i < ((s.length() + 1)/2); i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

}
