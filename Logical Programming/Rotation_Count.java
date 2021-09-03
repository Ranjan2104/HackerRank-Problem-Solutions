package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Rotation_Count {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
			
			int min = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] <= arr[min]) min = i;
			}
			System.out.println(min);
		}
	}
}
