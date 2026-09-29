package numbersystem;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		DecimalToHexadecimal1(31);
	}
	static void DecimalToHexadecimal1(int n) {
		String hexadecimal = "";
		while(n>0) {
			int rem = n % 16;
			if(rem < 10) {
				hexadecimal = rem + hexadecimal;
			} else {
				hexadecimal = (char)('A' + rem - 10) + hexadecimal;
//				hexadecimal = (char)(rem + 55) + hexadecimal;
			}
			n = n / 16;
		}
		System.out.println(hexadecimal);
	}
}
