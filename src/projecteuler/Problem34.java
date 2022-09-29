package projecteuler;

public class Problem34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberString;
		int sum;
		long total = 0;
		for(int i = 10; i < 2600000; i++) {
			numberString = i + "";
			sum = 0;
			for(int j = 0; j < numberString.length(); j++) {
				sum += factorial(Integer.parseInt(numberString.charAt(j) + ""));
			}
			if(i == sum) {
				System.out.println(i);
				total += sum;
			}
		}
		System.out.println(total);
	}
	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
	}

}
