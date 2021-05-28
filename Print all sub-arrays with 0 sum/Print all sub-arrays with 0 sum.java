public class Main {
	public static void main(String[] args) {
		int arr[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
		subArray(arr);
	}
	static void subArray(int arr[]) {
	    for(int i = 0; i < arr.length; i++) {
	        int sum = 0;
	        for(int j = i; j < arr.length; j++) {
	            sum += arr[j];
	            if(sum == 0)
	                System.out.println(i + "..." + j);
	        }
	    }
	}
} // Contributed by Amresh Ranjan.
// O(n*n)
