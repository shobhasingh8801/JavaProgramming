package numbersystem;

public class BinaryToDecimal {
	public static void main(String[] args) {
		binaryToDecimal1(1010);
	}
	static void binaryToDecimal1(int n) {
	    int decimal = 0;
	    int power = 1;
	    while (n > 0) {
	        int rem = n % 10;
	        decimal = decimal + rem * power;
	        n = n / 10;
	        power = power * 2;
	    }
	    System.out.println(decimal);
	}
}
