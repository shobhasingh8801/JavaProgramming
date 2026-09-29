package numbersystem;

public class Smallest {

	public static void main(String[] args) {
		int a = 30, b = 20, c = 10, d = 40;
		int small = a;
		if(b < small) 
			small = b;
		if(c < small) 
			small = c;
		if(d < small)
			small = d;
		System.out.println(small);
	}

}
