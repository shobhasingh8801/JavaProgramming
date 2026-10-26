package array;

public class SecondMax {
	public static void main(String[] args) {
		int arr[] = {80,20,90,20,30,150,100,150};
		int max = arr[0];
		int sMax = max;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				sMax = max;
				max = arr[i];
			} else if(arr[i] > sMax && arr[i] < max) {
				sMax = arr[i];
			}
		}
		System.out.println(sMax);
	}
}
