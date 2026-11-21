package Practice.Array;

public class TargetElement {
	public static void main(String[] args) {
		int arr[] = { 40, 10, 70, 60, 30 };
		int target = 60;
		int index = -1;
		for(int i = 0; i <= arr.length - 1; i++) {
			if(arr[i] == target) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println(index);
		}
	}
}
