package array;

public class MissingElement {
	public static void main(String[] args) {
		int a[] = {4,2,0,1};
		int n = a.length;
		int sum = n*(n+1)/2;
		int actSum = 0;
		for(int i = 0; i <= n-1; i++) {
			actSum = actSum + a[i];
		}
		System.out.println(sum - actSum);
	}
}
