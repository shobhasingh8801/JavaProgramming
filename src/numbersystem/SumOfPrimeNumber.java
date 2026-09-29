package numbersystem;

public class SumOfPrimeNumber {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of prime numbers = " + sum);
	}
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
