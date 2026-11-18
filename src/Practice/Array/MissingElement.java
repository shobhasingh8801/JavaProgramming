package Practice.Array;

public class MissingElement {
	public static void main(String[] args) {
		int a[] = {4,2,0,1};
		int n = a.length; 
		int sum = (n*(n+1))/2;
		int actsum = 0;
		for(int i = 0; i <= a.length -1; i++) {
			actsum = actsum + a[i];
		}
		System.out.println(sum - actsum);
	}
}
