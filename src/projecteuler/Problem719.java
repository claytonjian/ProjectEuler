package projecteuler;

public class Problem719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sNumberSum = 0;
		/*
		for(long i = 4; i * i <= 1000000000000l; i++) {
			String root = (i * i) + "";
			boolean alreadyCounted = false;
			System.out.println(root);
			for(long j = 1; j < (long)Math.pow(2, (root.length() - 1)) ; j++) {
				String combinations = String.format("%" + (root.length() - 1) + "s", Long.toBinaryString(j)).replaceAll(" ", "0");
				long start = 0;
				long sum = 0;
				for(long k = 0; k < root.length() - 1; k++) {
					if(combinations.charAt((int)k) == '1') {
						sum += Long.parseLong(root.substring((int)start, (int)(k + 1)));
						start = k + 1;
					}
				}
				sum += Long.parseLong(root.substring((int)start, (int)(root.length())));
				if(sum == i && !alreadyCounted) {
					sNumberSum += Long.parseLong(root);
					alreadyCounted = true;
				}
			}
		}
		*/
		
		String[] combinations = new String[4095];
		
		for(int i = 0; i < 4095; i++) {
			combinations[i] = String.format("%12s", Long.toBinaryString(i + 1)).replaceAll(" ", "0");
		}
		
		for(long i = 4; i <= 1000000; i++) {
			System.out.println(i);
			String square = (i * i) + "";
			//System.out.println("Square: " + square);
			boolean alreadyCounted = false;
			for(int j = 0; j < (long)Math.pow(2, (square.length() - 1)) - 1; j++) {
				String combinationTrimmed = combinations[j].substring(combinations[j].length() - square.length() + 1, combinations[j].length());
				//System.out.println(combinationTrimmed);
				long start = 0;
				long sum = 0;
				for(long k = 0; k < square.length() - 1; k++) {
					if(combinationTrimmed.charAt((int)k) == '1') {
						sum += Long.parseLong(square.substring((int)start, (int)(k + 1)));
						//System.out.println("Add: " + Long.parseLong(square.substring((int)start, (int)(k + 1))));
						start = k + 1;
					}
				}
				sum += Long.parseLong(square.substring((int)start, (int)(square.length())));
				//System.out.println("Add: " + Long.parseLong(square.substring((int)start, (int)(square.length()))));
				//System.out.println("Sum: " + sum);
				if(sum == i && !alreadyCounted) {
					sNumberSum += Long.parseLong(square);
					//System.out.println("Works!");
					alreadyCounted = true;
				}
			}
		}
		
		System.out.println(sNumberSum);
	}
}
