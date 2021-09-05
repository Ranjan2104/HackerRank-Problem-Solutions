package Daffodils_Unthinkable_Solution;
import java.util.*;
public class swap_adjacent_characters_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		swap(s);
	}
	static void swap(String s) {
		char[] str = s.toCharArray();
		char c = 0;
		int length = 0;
		length = str.length;
		if(length % 2 == 0) {
			for(int i = 0; i < length; i+= 2) {
			c = str[i];
			str[i] = str[i+1];
			str[i+1] = c;
			}
			System.out.print(str);
		}
		else System.out.print("NA");
	}
}
