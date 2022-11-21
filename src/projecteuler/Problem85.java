package projecteuler;

public class Problem85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numberOfRectangles = 0, width = 0, height = 0;
		long difference = 2000000;
		long area = 0;
		for(int i = 1; i <= 2000; i++) {
			for(int j = i; j <= 2000; j++) {
				numberOfRectangles = 0;
				for(int k = 1; k <= i; k++) {
					for(int l = 1; l <= j; l++) {
						numberOfRectangles += (i - k + 1) * (j - l + 1);
					}
				}
				if(Math.abs(numberOfRectangles - 2000000) < difference) {
					difference = Math.abs(numberOfRectangles - 2000000);
					area = i * j;
				}
				if(numberOfRectangles > 2000000) {
					break;
				}
			}
		}
		System.out.println(area);
	}
}
