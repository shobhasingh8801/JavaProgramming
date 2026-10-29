package array;

public class TargetElement {
	public static void main(String[] args) {
//		int a[] = {40,10,70,60,30};
//		int target = 60;
//		int index = -1;
//		for(int i = 0; i <= a.length-1; i++) {
//			if(a[i] == target) {
//				index = i;
//			}
//		}
//		if(index == -1) {
//			System.out.println("not found");
//		} else{
//			System.out.println(index);
//		}
		int a[] = {40,10,30,20};
		int target = 10;
		int index = linearSearch(a,target);
		if(index == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found in " +index);
		}
	}
	private static int linearSearch(int a[], int target) {
		for(int i = 0; i <= a.length-1; i++) {
			if(a[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
