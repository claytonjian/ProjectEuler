package projecteuler;

public class Problem92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOf89s = 0;
		for(int i = 1; i < 10000000; i++) {
			String number = i + "";
			while(!(number.equals("89") || number.equals("1"))) {
				int value = 0;
				for(int j = 0; j < number.length(); j++) {
					value += (int)Math.pow(Integer.parseInt(number.substring(j, j + 1)), 2);
				}
				number = value + "";
			}
			if(number.equals("89")) {
				numberOf89s++;
			}
		}
		System.out.println(numberOf89s);
	}

}
