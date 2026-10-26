package array;

public class RemoveDuplicate {
	public static void main(String[] args) {
//		int a[] = {1,2,3,2,4,1,5};
//		for(int i = 0; i <= a.length-1; i++) {
//			int count = 0;
//			for(int j = 0; j<= a.length-1; j++) {
//				if(a[i] == a[j]) {
//					count++;
//				}
//			}
//			if(count == 1) {
//				System.out.println(a[i] + " ");
//			}
//		}

		int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
