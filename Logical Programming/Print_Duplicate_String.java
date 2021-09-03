package Daffodils_Unthinkable_Solution;

public class Print_Duplicate_String {

	public static void main(String[] args) {
		String s = "aab";
		char[] arr = new char[256];
		for(int i = 0; i < s.length(); i++)
			arr[s.charAt(i)]++;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > 1)
				System.out.print((char) (i) + " ");
		}
	}
}
