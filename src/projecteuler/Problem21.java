package projecteuler;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int a = 1; a < 10000; a++) {
			int b = sumOfProperDivisors(a);
			if(b > a) {
				if(sumOfProperDivisors(b) == a) {
					sum += a + b;
				}
			}
		}
		System.out.println(sum);
	}
	public static int sumOfProperDivisors(int num) {
		int sum = 0;
		System.out.println("Num: " + num);
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}
}
