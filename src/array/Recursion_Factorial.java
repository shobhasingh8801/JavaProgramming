package array;

public class Recursion_Factorial {
	public static void main(String[] args) {
        m1(5, 1);
    }

    public static void m1(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }

        m1(n - 1, fact * n);
    }
}

