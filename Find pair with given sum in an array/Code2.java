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
		counting(arr, sum);
	}
	static void counting(int arr[], int sum) {
	    int start = 0;
	    int end = arr.length - 1;
	    while(start < end) {
	        if(arr[start] + arr[end] == sum) {
	            System.out.println("Pair found");
	            return;
	        } else {
			  System.out.println("Pair not found");
			}
	        start++;
	        end--;
	    }
	}
} // Contributed by Amresh Ranjan.
// O(nlogn).
