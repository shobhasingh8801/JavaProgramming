package numbersystem;

public class test {

	public static void main(String[] args) {
		int a = 20, b = 10, c = 30;
		int big = a;
		if(b > big) 
			big = b;
		if(c > big) 
			big = c;
		System.out.println(big);
	}

}
