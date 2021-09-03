package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Array_Difference {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt(); int[] arr = new int[n];
			for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
			int m = sc.nextInt(); int[] arr2 = new int[m];
			for(int i = 0; i < arr2.length; i++) arr2[i] = sc.nextInt();
			
			Set<Integer> ls = new LinkedHashSet<>();
			for(int i : arr2) {
				ls.add(i);
			}
			for(int i = 0; i < arr.length; i++) {
				if(!ls.contains(arr[i])) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
