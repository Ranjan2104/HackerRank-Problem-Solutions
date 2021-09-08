package Question_Solves;
import java.util.*;
public class Exple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		while(sc.hasNextInt()) {
			arr.add(sc.nextInt());
		}
		int n = arr.size();
		modify(arr, n);
		System.out.println(arr);
	}
	static void modify(ArrayList<Integer> arr, int n)
    {
        if (n <= 1) return;
        
        int prev = arr.get(0);
        int z = arr.get(0) * arr.get(1);
        arr.set(0, z);
        for (int i=1; i<n-1; i++)
        {
            int curr = arr.get(i);
            int s = prev * arr.get(i+1);
            arr.set(i, s);
            prev = curr;
        }
        int ss = prev * arr.get(n-1);
        arr.set(n-1, ss);
    }
}
