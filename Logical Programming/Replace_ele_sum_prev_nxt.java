package Daffodils_Unthinkable_Solution;

public class Replace_ele_sum_prev_nxt {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6}; int n = arr.length;
		replace(arr, n);
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
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
