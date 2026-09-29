package numbersystem;

public class CountOddDigits {
	static int count(int n) {
		int count = 0;
		while(n>0) {
			int digit = n % 10;
			if(digit % 2 != 0) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}
	public static void main(String[] args) {
		int n = 234567;
		System.out.println(count(n));
	}
}
