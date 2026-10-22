package array;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int arr[] = {10,9,2,9,9,8};
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
			System.out.println(key + "- " +count);
		}
	}
}
