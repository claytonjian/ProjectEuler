package projecteuler;

public class Problem4 {

	public static void main(String[] args) {
		int biggestPalindrome = 0;
		for(int i = 999; i > 0; i--) {
			for(int j = 999; j > 0; j--) {
				if(isPalindrome("" + (i * j))) {
					if((i * j) > biggestPalindrome) {
						biggestPalindrome = i * j;
					}
				}
			}
		}
		System.out.println(biggestPalindrome);
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
