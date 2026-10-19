package pattern;

public class Sat10{
    public static void main(String[] args) {
//        int n = 4;
//        // Upper half
//        for (int i = n; i >= 1; i--) {
//            // Spaces
//            for (int j = 0; j < n - i; j++) {
//                System.out.print("  ");
//            }
//            // Stars
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                if(i % 2 == 1) {
//                	System.out.print((char)(j + 64) + " ");
//                } else {
//                	System.out.print((char)(j + 96) + " ");
//                }
//            }
//            System.out.println();
//        }
//        // Lower half
//        for (int i = 2; i <= n; i++) {
//            // Spaces
//            for (int j = 0; j < n - i; j++) {
//                System.out.print("  ");
//            }
//            // Stars
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                if(i % 2 == 1) {
//                	System.out.print((char)(j + 64) + " ");
//                } else {
//                	System.out.print((char)(j + 96) + " ");
//                }
//            }
//            System.out.println();
//        }
    	
//Other Way :
    	
    	int n = 7;
    	int sp = 0; 
    	int st = n;
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= sp; j++) {
    			System.out.print("  ");
    		}
    		for(int j = 1; j <= st; j++) {
    			if(i % 2 == 0) {
    				System.out.print((char)(j + 64) + " ");
    			} else {
    				System.out.print((char)(j + 96)+ " ");
    			}
    		}
    		if(i <= n/2) {
    			sp++;
    			st = st - 2;
    		} else {
    			sp--;
    			st = st + 2;
    		}
    		System.out.println();
    	}
    }
}

