package projecteuler;

import java.util.HashMap;

public class Problem44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long, Integer> pentagons = new HashMap<Long, Integer>();
		long difference = 1000000000;
		for(int i = 1; i < 10000; i++) {
			pentagons.put((long)(i * (3 * i - 1)/2), 1);
		}
		for(int a = 1; a < pentagons.size(); a++) {
			for(int b = a + 1; b < pentagons.size(); b++) {
				if(pentagons.containsKey(((long)(b * (3 * b - 1)/2)) - ((long)(a * (3 * a - 1)/2))) && pentagons.containsKey(((long)(b * (3 * b - 1)/2)) + ((long)(a * (3 * a - 1)/2)))) {
					//System.out.println((((long)(b * (3 * b - 1)/2)) - ((long)(a * (3 * a - 1)/2))) + " " + ((long)(a * (3 * a - 1)/2)) + " " + ((long)(b * (3 * b - 1)/2)) + " " + (((long)(b * (3 * b - 1)/2)) + ((long)(a * (3 * a - 1)/2))));
					if(difference > ((long)(b * (3 * b - 1)/2)) - ((long)(a * (3 * a - 1)/2))) {
						difference = ((long)(b * (3 * b - 1)/2)) - ((long)(a * (3 * a - 1)/2));
					}
				}
			}
		}
		System.out.println(difference);
	}

}
