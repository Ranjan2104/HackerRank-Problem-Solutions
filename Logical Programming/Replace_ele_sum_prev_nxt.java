package Daffodils_Unthinkable_Solution;

import java.util.Scanner;

public class Replace_ele_sum_prev_nxt {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int[] arr = new int[m]; int n = arr.length;
			for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
			replace(arr, n);
			for(int i = 0; i < arr.length; i++) 
				System.out.print(arr[i] + " ");
		}
	}
	static void replace(int[] arr, int n) {
		int prev = arr[0];
		arr[0] = arr[0] + arr[1];
		for(int i = 1; i < n-1; i++) {
			int curr = arr[i];
			arr[i] = prev + arr[i+1];
			prev = curr;
		}
		arr[n-1] = prev + arr[n-1];
	}
}
