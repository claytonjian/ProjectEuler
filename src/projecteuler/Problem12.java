package projecteuler;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentFactors = 0, counter = 1, increment = 1;
		while(currentFactors < 501) {
			currentFactors = 0;
			counter = increment * (increment + 1) / 2;
			for(int i = 1; i < (int)Math.sqrt(counter); i++) {
				if(i * i == counter) {
					currentFactors += 1;
				}
				else {
					if(counter % i == 0) {
						currentFactors += 2;
					}
				}
			}
			increment++;
		}
		System.out.println(counter);
	}

}
