package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			System.out.println(longestPalindrome(s));
		}
	}
	static String longestPalindrome(String s) {
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            int odd = func(s, i, i);
            int even = func(s, i, i+1);
            
            int len = Math.max(odd, even);
            if(len > end - start) {
                start = i - (len-1) / 2;
                end = i + (len) / 2;
            }
        }
        return s.substring(start, end+1);
    }
    static int func(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
