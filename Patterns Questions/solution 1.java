import java.util.*;

public class Solu_9 {

	public static void main(String[] args) { 
		int n = 5;
		pattern8(n);
	}
	
	static void pattern1(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*" + " ");
			System.out.println();
		}
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
	}
	
	static void pattern2(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--)
				System.out.print("*" + " ");
			System.out.println();
		}
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
	}
	
	static void pattern3(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*" + " ");
			System.out.println();
		}
		for(int i = 1; i <= n; i++) {
			for(int j = n-1; j >= i; j--)
				System.out.print("*" + " ");
			System.out.println();
		}
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
	}
	
	static void pattern4(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) 
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
//	      *
//	     **
//	    ***
//	   ****
//	  *****
	}
	
	static void pattern5(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) 
				System.out.print(" ");
			for(int k = n; k >= i; k--)
				System.out.print("*");
			System.out.println();
		}
//		 *****
//		  ****
//		   ***
//		    **
//		     *
	}
	
	static void pattern6(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n-1; j >= i; j--) 
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) 
				System.out.print(" ");
			for(int k = n-1; k >= i; k--)
				System.out.print("*");
			System.out.println();
		}
//	     *
//	    **
//	   ***
//	  ****
//	 *****
//	  ****
//	   ***
//	    **
//	     *      
	}
	
	static void pattern7(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) 
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*" + " ");
			System.out.println();
		}
//	      * 
//	     * * 
//	    * * * 
//	   * * * * 
//	  * * * * * 
	}
	
	static void pattern8(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j || i + j == n - 1)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
