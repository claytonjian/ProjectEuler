package projecteuler;

import java.util.HashMap;

public class Problem39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highestSolutions = 0;
		int solutions;
		int perimeter = 0;
		for(int i = 1; i <= 1000; i++) {
			solutions = numOfSolutions(i);
			if(solutions > highestSolutions) {
				highestSolutions = solutions;
				perimeter = i;
			}
		}
		System.out.println(perimeter);
	}
	public static int numOfSolutions(int p) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int a = 1; a <= p; a++) {
			for(int b = 1; b <= p; b++) {
				double c = Math.sqrt(a * a + b * b);
				if(a + b + (int)c == p && Math.abs(c - (int)Math.sqrt(a * a + b * b)) < 0.00001) {
					if(a < b) {
						map.put(a + "" + b + "" + c, 1);
					}
					else {
						map.put(b + "" + a + "" + c, 1);
					}
				}
			}
			
		}
		return map.size();
	}
}
