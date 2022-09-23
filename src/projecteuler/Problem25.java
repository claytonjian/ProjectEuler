package projecteuler;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger f1 = BigInteger.ONE;
		BigInteger f2 = BigInteger.ONE;
		BigInteger f3 = BigInteger.valueOf(2);
		int index = 3;
		while(f3.toString().length() != 1000) {
			f1 = f2;
			f2 = f3;
			f3 = f1.add(f2);
			index++;
		}
		System.out.println(index);
	}

}
