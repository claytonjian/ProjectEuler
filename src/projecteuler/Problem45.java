package projecteuler;

public class Problem45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t = 286, p = 166, h = 144;
		while(triangle(t) != pentagon(p) || pentagon(p) != hexagon(h) || triangle(t) != hexagon(h)) {
			if(triangle(t) <= pentagon(p) && triangle(t) <= hexagon(h)) {
				t++;
			}
			else if(pentagon(p) <= triangle(t) && pentagon(p) <= hexagon(h)) {
				p++;
			}
			else if(hexagon(h) <= triangle(t) && hexagon(h) <= pentagon(p)) {
				h++;
			}
		}
		System.out.println(t + " " + p + " " + h);
		System.out.println(triangle(t));
	}
	public static long triangle(long n) {
		return n * (n + 1)/2;
	}
	public static long pentagon(long n) {
		return n * (3 * n - 1)/2;
	}
	public static long hexagon(long n) {
		return n * (2 * n - 1);
	}
}
