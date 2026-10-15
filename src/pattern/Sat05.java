package pattern;

public class Sat05 {
    public static void main(String[] args) {
//        int n = 4;
//        // Upper part
//        for (int i = 1; i <= n; i++) {
//            // spaces
//            for (int j = i; j < n; j++) {
//                System.out.print("  ");
//            }
//            // stars
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        // Lower part
//        for (int i = n - 1; i >= 1; i--) {
//            // spaces
//            for (int j = i; j < n; j++) {
//                System.out.print("  ");
//            }
//            // stars
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    	
// Other Way :
    	
    	int n = 7;
    	int sp = n /2;
    	int st = 1;
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= sp; j++) {
    			System.out.print("  ");
    		}
    		for(int j = 1; j <= st; j++) {
    			System.out.print("* ");
    		}
    		if(i <= n / 2) {
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
