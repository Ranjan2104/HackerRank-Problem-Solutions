package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Maximal_rec_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(); int C = sc.nextInt();
		
		int[][] A = new int[R][C];
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				A[i][j] = sc.nextInt();
			}
		}
        System.out.print(maxRectangle(R, C, A));

	}
	static int maxRectangle(int R, int C, int A[][])
    {
        int result = maxHist(R, C, A[0]);

        for (int i = 1; i < R; i++) {

            for (int j = 0; j < C; j++)

                if (A[i][j] == 1)
                    A[i][j] += A[i - 1][j];

            result = Math.max(result, maxHist(R, C, A[i]));
        }

        return result;
    }
	static int maxHist(int R, int C, int row[])
    {
        
        Stack<Integer> result = new Stack<Integer>();

        int top_val; 

        int max_area = 0;
        
        int area = 0;

        int i = 0;
        while (i < C) {
            if (result.empty()
                || row[result.peek()] <= row[i])
                result.push(i++);

            else {
                top_val = row[result.peek()];
                result.pop();
                area = top_val * i;

                if (!result.empty())
                    area
                        = top_val * (i - result.peek() - 1);
                max_area = Math.max(area, max_area);
            }
        }
        while (!result.empty()) {
            top_val = row[result.peek()];
            result.pop();
            area = top_val * i;
            if (!result.empty())
                area = top_val * (i - result.peek() - 1);

            max_area = Math.max(area, max_area);
        }
        return max_area;
    }
}
