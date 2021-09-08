package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Find_sub_matrix_with_maximum_XOR {
	static int N =101;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int prefix_xor[][] = new int[N][N];
		
		prefix(arr, prefix_xor, n);

	    Max_xor(prefix_xor, n);
	}
	static void prefix(int arr[][], int prefix_xor[][], int n)
	{
	    for (int i = 1; i < n; i++)
	    {
	        for (int j = 1; j < n; j++)
	        {

	            prefix_xor[i][j] = arr[i][j] ^
	                            prefix_xor[i - 1][j] ^
	                            prefix_xor[i][j - 1] ^
	                            prefix_xor[i - 1][j - 1];
	        }
	    }
	}
	static void Max_xor(int prefix_xor[][], int n)
	{
	    int max_value = 0;
	    for (int i = 1; i <= n; i++)
	    {
	        for (int j = 1; j <= n; j++)
	        {
	            for (int i1 = i; i1 <= n; i1++)
	            {
	                for (int j1 = j; j1 <= n; j1++)
	                {
	                    int x = 0;
	                    x ^= prefix_xor[i1][j1];
	                    x ^= prefix_xor[i - 1][j - 1];
	                    x ^= prefix_xor[i1][j - 1];
	                    x ^= prefix_xor[i - 1][j1];

	                    max_value = Math.max(max_value, x);
	                }
	            }
	        }
	    }
	    System.out.println(max_value);
	}
}
