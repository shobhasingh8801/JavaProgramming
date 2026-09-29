package numbersystem;

public class DesariumNumber {
	public static void main(String[] args) {
		int n = 135;
		if (isdesariumNumber(n)) {
			System.out.println("Desarium");
		} else {
			System.out.println("Not Desarium");
		}
	}
	private static boolean isdesariumNumber(int n) {
		int count = (n + "").length();
		int sum = 0;
		int original = n;
		while (n > 0) {
			sum += Math.pow(n % 10, count--);
//			sum = sum+(int)Math.pow(n % 10, count--);
			n = n / 10;
//			count--;
		}
		return sum == original;
	}
}
