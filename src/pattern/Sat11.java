package pattern;

public class Sat11 {

    public static void main(String[] args) {

        int n = 7;
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            // Stars
            for (int j = 1; j <= st; j++) {

                if (j == 1 || j == st) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Update after completing one row
            if (i <= n / 2) {
                sp--;
                st = st + 2;
            } else {
                sp++;
                st = st - 2;
            }
            System.out.println();
        }
    }
}