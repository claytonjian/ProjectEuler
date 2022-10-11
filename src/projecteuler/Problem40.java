package projecteuler;

public class Problem40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = new String[1000100];
		int counter = 0, arrayCounter = 0;
		while(array[1000000] == null) {
			String counterString = counter + "";
			while(!counterString.isEmpty()) {
				array[arrayCounter++] = counterString.charAt(0) + "";
				counterString = counterString.substring(1);
			}
			counter++;
		}
		int product = 	Integer.parseInt(array[1]) *
						Integer.parseInt(array[10]) *
						Integer.parseInt(array[100]) *
						Integer.parseInt(array[1000]) *
						Integer.parseInt(array[10000]) *
						Integer.parseInt(array[100000]) *
						Integer.parseInt(array[1000000]);
		System.out.println(product);
	}

}
