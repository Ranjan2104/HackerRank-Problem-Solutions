package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Longest_Palindrome {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			System.out.println(longestPalindrome(s));
		}
	}
	static int longestPalindrome(String s) {
		int[] lowercase = new int[26]; int[] uppercase = new int[26];
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch - 97 >= 0) lowercase[ch-97]++;
			else uppercase[ch - 65]++;
		}
		int ans = 0;
		boolean isfirst = false;
		for(int i = 0; i < lowercase.length; i++) {
			if(lowercase[i] % 2 == 0) ans += lowercase[i];
			else {
				if(isfirst == false) {
					ans += lowercase[i];
					isfirst = true;
				}
				else ans += lowercase[i] - 1;
			}
		}
		for(int i = 0; i < uppercase.length; i++) {
			if(uppercase[i] % 2 == 0) ans += uppercase[i];
			else {
				if(isfirst == false) {
					ans += uppercase[i];
					isfirst = true;
				}
				else ans += uppercase[i] - 1;
			}
		}
		return ans;
	}
}
