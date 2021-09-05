package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Sort_array_of_0s_1s_and_2s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		
		int c0 = 0, c1 = 0, c2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) c0++;
			else if(arr[i] == 1) c1++;
			else c2++;
		}
		
		int k = 0;
		for(int i = 0; i < c0; i++) arr[k++] = 0;
		for(int i = 0; i < c1; i++) arr[k++] = 1;
		for(int i = 0; i < c2; i++) arr[k++] = 2;
		
		for(int i = 0;i < arr.length; i++) System.out.println(arr[i]);
	}
}
