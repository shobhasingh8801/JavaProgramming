package numbersystem;

public class SmallestBiggestDigit {
	public static void main(String[] args) {
		int num = 36825;
		int smallest = 9 ;
		int biggest = 0;
		while(num > 0) {
			int digit = num % 10;
			if(digit < smallest) {
				smallest = digit;
			}
			if(digit > biggest) {
				biggest = digit;
			}
			num = num / 10;
		}
		System.out.println("Smallest digit = " +smallest);
		System.out.println("Biggest digit = " +biggest);
	}
}
