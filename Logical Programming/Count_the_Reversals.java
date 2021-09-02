package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Count_the_Reversals {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next(); int len = s.length();
			System.out.println(countRev(s, len));
		}
	}
	static int countRev(String s, int len) {
		if(len % 2 != 0) return -1;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if(!stack.isEmpty() && ch == '}') {
				if(stack.peek() == '{') stack.pop();
				else stack.push(ch);
			}
			else stack.push(ch);
		}
		int res = stack.size(); int n = 0;
		while(!stack.isEmpty() && stack.peek() == '{') {
			stack.pop(); n++;
		}
		return (res / 2 + n % 2);
	}
}
