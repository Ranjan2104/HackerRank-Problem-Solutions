package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Minimum_Absolute_Difference {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
			System.out.print(minimumAbsDifference(arr));
		}
	}
	static List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		int min_diff = Integer.MAX_VALUE;
		List<List<Integer>> res = new ArrayList<>();
		for(int i = 1; i < arr.length; i++) {
			min_diff = Math.min(min_diff, arr[i] - arr[i-1]);
		}
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[i-1] == min_diff) {
				List<Integer> l1 = new ArrayList<>();
				l1.add(arr[i-1]);
				l1.add(arr[i]);
				res.add(l1);
			}
		}
		return res;
	}
}
