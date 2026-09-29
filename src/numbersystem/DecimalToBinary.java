package numbersystem;

public class DecimalToBinary {
	public static void main(String[] args) {
		DecimalToBinary1(10);
	}
	static void DecimalToBinary1(int n) {
		String binary = "";
		while(n>0) {
			int rem = n % 2;
			binary = rem + binary;
			n = n / 2;
		}
		System.out.println(binary);
	}
}
