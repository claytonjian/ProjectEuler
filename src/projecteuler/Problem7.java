package projecteuler;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nthPrime = 1, number = 2;
		while(nthPrime != 10001) {
			number++;
			boolean prime = true;
			for(int i = 2; i < number; i++) {
				if(number % i == 0){
					prime = false;
					break;
				}
			}
			if(prime) {
				nthPrime++;
			}
		}
		System.out.println(number);
	}

}
