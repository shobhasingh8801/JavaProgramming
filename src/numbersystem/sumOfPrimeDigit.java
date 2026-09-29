package numbersystem;

public class sumOfPrimeDigit {
	static int sumOfPrime(int n) {
		int sum = 0;
		while(n>0) {
			int digit = n % 10;
			if(digit == 2 || digit == 3 || digit == 5 || digit == 7 ) {
				sum = sum + digit;
			}
			n = n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 123456789;
		System.out.println(sumOfPrime(n));
	}
}
