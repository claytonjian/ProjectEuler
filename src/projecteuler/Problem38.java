package projecteuler;

public class Problem38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		for(int i = 0; i < 1000000; i++) {
			String productString = "";
			int productCounter = 1;
			while(productString.length() < 9) {
				productString += i * productCounter;
				productCounter++;
			}
			if(productString.length() == 9 && productCounter >=2 && isPandigital(productString)) {
				if(number < Integer.parseInt(productString)) {
					number = Integer.parseInt(productString);
				}
			}
		}
		System.out.println(number);

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
