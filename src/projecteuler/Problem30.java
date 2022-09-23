package projecteuler;

public class Problem30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long counter = 10;
		long total = 0;
		while(counter < 1000000) {
			String numString = counter + "";
			long sum = 0;
			for(int i = 0; i < numString.length(); i++) {
				sum += Math.pow(Integer.parseInt(numString.substring(i, i + 1)), 5);
			}
			if(sum == counter) {
				total += sum;
			}
			counter++;
		}
		System.out.println(total);
	}

}
