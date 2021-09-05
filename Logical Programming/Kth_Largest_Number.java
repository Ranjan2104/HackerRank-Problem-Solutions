package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Kth_Largest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		int k = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < arr.length; i++) {
			if(i < k) {
				pq.add(arr[i]);
			}
			else {
				if(arr[i] > pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		while(pq.size() > 0) {
			if(k == pq.size()) System.out.println(pq.remove());
		}
	}
}
