package numbersystem;

public class GCD {
	public static void main(String[] args) {
		int a = 24;
		int b = 36;
		while(b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}
		System.out.println("GCD = " +a);
	}
}
