package projecteuler;

public class Problem97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prime = 28433;
		for(int i = 0; i < 7830457; i++) {
			prime *= 2;
			if(prime / 10000000000l != 0) {
				prime %= 10000000000l;
			}
		}
		System.out.println(++prime);
		String s = "12345";
		String[] sArray = s.split("\\d+", 0);
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
	}
}
