package Daffodils_Unthinkable_Solution;
import java.util.*;

public class Count_duplicate_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(count(s));
	}
	static int count(String s) {
		int count = 0;
		Set<Character> ls = new LinkedHashSet<>();
		for(char ch : s.toCharArray()) {
			if(ls.contains(ch)) count++;
			
			else ls.add(ch);
		}
		return count;
	}
}
