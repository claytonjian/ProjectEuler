package projecteuler;

public class Problem28 {

	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1; i <= 500; i++) {
			sum += 	(int)(Math.pow((2 * i + 1), 2)) + 
					(int)(Math.pow((2 * i + 1), 2)) - 6 * i + 
					(int)(Math.pow((2 * i + 1), 2)) - 2 * i + 
					(int)(Math.pow((2 * i + 1), 2)) - 4 * i;
		}
		System.out.println(sum);
	}

}
