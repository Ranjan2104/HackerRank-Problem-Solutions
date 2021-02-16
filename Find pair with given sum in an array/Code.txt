/* package code; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = {8,7,2,5,3,1};
		int sum = 10;
		System.out.println(counting(arr, sum));
	}
	static int counting(int arr[], int sum) {
	    int start = 0;
	    int count = 0;
	    int end = arr.length - 1;
	    for(int i = start; i <= end; i++) {
	        for(int j = start + 1; j <= end; j++) {
	            if(arr[i] + arr[j] == sum)
	                count++;
	        }
	    }
	    return count;
	}
} // Contributed by Amresh Ranjan
// O(N*N).
