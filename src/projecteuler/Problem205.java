package projecteuler;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Problem205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] peter = new long[37];
		long[] colin = new long[37];
		Arrays.fill(peter, 0);
		Arrays.fill(colin, 0);
		
		// Peter odds
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				for(int k = 1; k <= 4; k++) {
					for(int l = 1; l <= 4; l++) {
						for(int m = 1; m <= 4; m++) {
							for(int n = 1; n <= 4; n++) {
								for(int o = 1; o <= 4; o++) {
									for(int p = 1; p <= 4; p++) {
										for(int q = 1; q <= 4; q++) {
											int sum = i + j + k + l + m + n + o + p + q;
											peter[sum]++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		// Colin odds
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				for(int k = 1; k <= 6; k++) {
					for(int l = 1; l <= 6; l++) {
						for(int m = 1; m <= 6; m++) {
							for(int n = 1; n <= 6; n++) {
								int sum = i + j + k + l + m + n;
								colin[sum]++;
							}
						}
					}
				}
			}
		}
		
		BigDecimal numerator = BigDecimal.ZERO;
		BigDecimal denominator = BigDecimal.valueOf(262144).multiply(BigDecimal.valueOf(46656));
		
		for(int i = 9; i <= 36; i++) {
			for(int j = 6; j < i; j++) {
				numerator = numerator.add(BigDecimal.valueOf(peter[i]).multiply(BigDecimal.valueOf(colin[j])));
			}
		}
		
		System.out.println(numerator.divide(denominator, 7, RoundingMode.HALF_UP));
	}

}
