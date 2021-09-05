package Daffodils_Unthinkable_Solution;
import java.util.*;
public class Double_duplicate_Vowels_in_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(duplicateVowels(str));
	}
	static String duplicateVowels(String str) {
		int t = str.length();
        String res = "";
        for (int i = 0; i < t; i++) {
            if (isVowel(str.charAt(i)))
                res += str.charAt(i);
            res += str.charAt(i);
        }
        return res;
	}
	static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' || ch == 'U');
	}
}
