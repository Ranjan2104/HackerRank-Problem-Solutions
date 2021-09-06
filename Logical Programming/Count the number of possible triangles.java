import java.util.*;

class Solution
{
    //Function to count the number of possible triangles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        int n = arr.length;
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int z = findNumberOfTriangles(arr, n);
        System.out.println(z);
    }
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for(int i = n-1; i >= 0; i--) {
            int l = 0;
            int r = i-1;
            while(l < r) {
                if(arr[l] + arr[r] > arr[i]) {
                    count += r-l;
                    r--;
                }
                else l++;
            }
        }
        return count;
    }
}