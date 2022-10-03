package projecteuler;

public class Problem36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < 1000000; i++) {
			if(isPalindrome(i + "") && isPalindrome(Integer.toString(i, 2))) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	public static boolean isPalindrome(String num) {
		for(int i = 0; i < num.length()/2; i++) {
			if(num.charAt(i) != num.charAt(num.length()- i - 1)) {
				return false;
			}
		}
		return true;
	}
}
