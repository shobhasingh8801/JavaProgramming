package numbersystem;

public class DecimalToOctal {
	public static void main(String[] args) {
		DecimalToOctal1(25);
	}
	static void DecimalToOctal1(int n) {
		String octal = "";
		while(n>0) {
			int rem = n % 8;
			octal = rem + octal;
			n = n / 8;
		}
		System.out.println(octal);
	}
}
