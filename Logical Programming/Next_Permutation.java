package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Next_Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        findNext(arr, n);
	}
	static void findNext(int ar[], int n) {
        int i;
        for (i = n - 1; i > 0; i--) {
            if (ar[i] > ar[i - 1])
                break;
        }
        if (i == 0) return;
        else 
        {
            int x = ar[i - 1], min = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (ar[j] > x && ar[j] < ar[min]) 
                {
                    min = j;
                }
            }
            swap(ar, i - 1, min);
            Arrays.sort(ar, i, n);
            for (i = 0; i < n; i++) System.out.print(ar[i] + " ");
        }
    }
	static void swap(int ar[], int i, int j) 
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
