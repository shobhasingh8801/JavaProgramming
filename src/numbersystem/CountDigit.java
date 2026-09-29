package numbersystem;

public class CountDigit {
	public static void main(String[] args) {
		int num = 343245;
		int digitToFind = 3;
		int count = 0;
		while(num > 0) {
			int digit = num % 10;
			if(digit == digitToFind) {
				count++;
			}
			num = num/10;
		}
		System.out.println("Digit "+digitToFind +" is present "+count+ " times");
	}
}
