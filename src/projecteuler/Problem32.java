package projecteuler;

import java.util.HashMap;

public class Problem32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		long sum = 0;
		
		for(int i = 1; i < 10000; i++) {
			for(int j = 1; j < (int)(Math.sqrt(i)); j++) {
				String productString = "";
				if(i % j == 0) {
					productString = (i / j) + "" + j + "" + i;
					if(isPandigital(productString) && productString.length() == 9) {
						sum += i;
						break;
					}
				}
			}
		}
		System.out.println(sum);
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
