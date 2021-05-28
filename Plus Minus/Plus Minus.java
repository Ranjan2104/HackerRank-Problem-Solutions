public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int len = arr.length;
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        for(int i = 0; i < len; i++)
        {
            int element = arr[i];
            if(element < 0)
            {
                negativeCount++;
            }
            if(element > 0)
            {
                positiveCount++;
            }
            if(element == 0)
            {
                zeroCount++;
            }
        }
        System.out.printf("%1.6f\n",positiveCount / len );
        System.out.printf("%1.6f\n",negativeCount / len);
        System.out.printf("%1.6f\n",zeroCount / len);
    }
// Contributed by Amresh Ranjan.