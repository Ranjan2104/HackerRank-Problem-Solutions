package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Array_Rotation_k_axis {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
			int k = sc.nextInt();
			rotate(arr, k);
			for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		}
	}
	static void rotate(int[] arr, int k) {
		k = k % arr.length;
		if(k < 0) k = k + arr.length;
		//1 half
		reverse(arr, 0, arr.length-k-1);
		// 2 half
		reverse(arr, arr.length-k, arr.length-1);
		// All list
		reverse(arr, 0, arr.length-1);
	}
	static void reverse(int[] arr, int i, int j) {
		int li = i; int ri = j;
		while(li < ri) {
			int temp = arr[li];
			arr[li] = arr[ri];
			arr[ri] = temp;
			li++;
			ri--;
		}
	}
}
