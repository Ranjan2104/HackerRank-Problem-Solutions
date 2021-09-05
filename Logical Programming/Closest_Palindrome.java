package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Closest_Palindrome {
		
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.next();
			System.out.println(nearestPalindromic(n));
		}
	}
	static String nearestPalindromic(String n) {
		int len = n.length();
        int i = len % 2 == 0 ? len / 2 - 1: len / 2;
        long left = Long.parseLong(n.substring(0, i+1));
        List<Long> candidate = new ArrayList<>();
        
        candidate.add(getPalindrome(left, len % 2 == 0));
        candidate.add(getPalindrome(left + 1, len % 2 == 0));
        candidate.add(getPalindrome(left - 1, len % 2 == 0)); 
        candidate.add((long)Math.pow(10, len - 1) - 1);
        candidate.add((long)Math.pow(10, len) + 1);
        
        long diff = Long.MAX_VALUE;
        long res = 0;
        long nl = Long.parseLong(n);
        
        for (long cand : candidate) {
            if (cand == nl){
                continue;
            } 
            if (Math.abs(cand - nl) < diff) {
                diff = Math.abs(cand - nl);
                res = cand;
            } else if (Math.abs(cand - nl) == diff) {
                res = Math.min(res, cand);
            }
        }
        
        return String.valueOf(res);
    }
    private static long getPalindrome(long left, boolean even) {
        long res = left;
        if (!even){
            left = left / 10;
        }
        while (left > 0) {
            res = res * 10 + left % 10;
            left /= 10;
        }
        return res;
    }
}
