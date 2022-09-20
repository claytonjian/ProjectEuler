package projecteuler;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ones[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String teens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String tens[] = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String hundred = "hundred";
		String and = "and";
		int length = 0;
		for(int i = 1; i <= 999; i++) {
			if(i / 100 > 0) {
				length += ones[(i / 100) - 1].length() + hundred.length();
				if(i % 100 != 0) {
					length += and.length();
				}
			}
			// tens and ones digits
			if(i % 100 != 0) {
				if(i % 100 < 20) {
					if(i % 100 == 10) {
						length += tens[0].length();
					}
					else if(i % 100 < 10) {
						length += ones[(i % 100) - 1].length();
					}
					else if(i % 100 < 20){
						length += teens[(i % 100) - 11].length();
					}
				}
				else {
					length += tens[(i % 100 / 10) - 1].length();
					if(i % 10 != 0) {
						length += ones[(i % 10) - 1].length();
					}
				}
			}
		}
		// for one thousand
		length += 11;
		System.out.println(length);
	}

}
