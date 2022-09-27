package projecteuler;

public class Problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ways = 0;
		for(int i = 0; i <= 1; i++) {	// $2
			for(int j = 0; j <= 2; j++) {	// $1
				for(int k = 0; k <= 4; k++) {	// $0.50
					for(int l = 0; l <= 10; l++) {	// $0.20
						for(int m = 0; m <= 20; m++) {	// $0.10
							for (int n = 0; n <= 40; n++) {		// $0.05
								for(int o = 0; o <= 100; o++) {	// $0.02
									for(int p = 0; p <= 200; p++) {	// $0.01
										if(i * 200 + j * 100 + k * 50 + l * 20 + m * 10 + n * 5 + o * 2 + p * 1 == 200) {
											ways++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(ways);
	}

}
