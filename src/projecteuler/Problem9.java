package projecteuler;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 1, c = 1;
		for(int i = 1; i < 1000; i++) {
			a = i;
			for(int j = 1; j < 1000; j++) {
				b = j;
				c = 1000 - b - a;
				if(a * a + b * b == c * c) {
					System.out.println(a * b * c);
				}
			}
		}
	}

}
