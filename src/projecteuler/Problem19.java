package projecteuler;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int currentDay = 366;
		int sundayCount = 0;
		for(int i = 1901; i <= 2000; i++) {
			for(int j = 0; j < daysInMonth.length; j++) {
				currentDay %= 7;
				if(currentDay == 0) {
					sundayCount++;
				}
				currentDay += daysInMonth[j];
				if(j == 1 && i % 4 == 0 && i % 400 != 0) {
					currentDay++;
				}
			}
		}
		System.out.println(sundayCount);
	}
}
