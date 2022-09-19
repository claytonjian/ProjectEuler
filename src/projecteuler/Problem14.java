package projecteuler;

import java.util.HashMap;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long longestLength = 0, longestLengthNumber = 1;
		HashMap<Long, Long> collatzLengths = new HashMap<Long, Long>(); 
		for(long i = 2; i < 1000000; i++) {
			long number = i, length = 1;
			while(number != 1) {
				if(collatzLengths.containsKey(number)){
					length += collatzLengths.get(number) - 1;
					number = 1;
				}	
				else if(number % 2 == 0) {
					number /= 2;
					length++;
				}
				else {
					number = 3 * number + 1;
					length++;
				}
			}
			if(length > longestLength) {
				longestLength = length;
				longestLengthNumber = i;
			}
			collatzLengths.put(i, length);
		}
		System.out.println(longestLengthNumber);
	}

}
