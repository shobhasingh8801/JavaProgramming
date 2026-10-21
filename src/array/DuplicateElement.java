package array;

public class DuplicateElement {
	public static void main(String[] args) {
		int arr[] = {10,20,10,11,22,30,11};
		boolean[] isPresent = new boolean[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if(isPresent[i]) 
				continue;
			int key = arr[i];
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(key == arr[j]) {
					isPresent[j] = true;
					count++;
				}
			}
			if(count > 1) {
				System.out.println(key);
			}
		}
	}
}
