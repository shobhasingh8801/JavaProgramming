package array;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int a[] = {5, 0, 1, 2, 6, 9};
        int j = 0;
        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for (int i = 0; i <= a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
