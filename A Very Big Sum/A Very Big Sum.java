public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(int n = 0; n < ar.length; n++)
        {
            sum += ar[n];
        }
        return sum;
    }
// Contributed by Amresh Ranjan