package projecteuler;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		boolean numbers[] = new boolean[2000000];
		numbers[0] = false;
		numbers[1] = false;
		numbers[2] = true;
		
		for(int i = 3; i < numbers.length; i++) {
			if(i % 2 == 0) {
				numbers[i] = false;
			}
			else {
				numbers[i] = true;
			}
		}
		int sqrtLimit = (int)Math.ceil(Math.sqrt(2000000));
		for(int i = 3; i < sqrtLimit; i = i + 2) {
			if(numbers[i]) {
				for(int j = 2; i * j < numbers.length ; j++) {
					numbers[i * j] = false;
				}
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
