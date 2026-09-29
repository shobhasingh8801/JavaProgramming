package numbersystem;

public class neonNumber {
	static boolean isNeon(int n) {
		int square = n * n;
		int sum = 0;
		while(square > 0) {
			int digit = square % 10;
			sum = sum + digit;
			square = square / 10;
		}
		if(sum == n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int n = 9;
		System.out.println(isNeon(n));
	}
}
