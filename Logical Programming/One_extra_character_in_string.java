package Daffodils_Unthinkable_Solution;

public class One_extra_character_in_string {

	public static void main(String[] args) {
		String strA = "kxml";
	    String strB = "klxml";
	    
	    System.out.println(findCharcter(strA.toCharArray(), strB.toCharArray()));
	}
	static char findCharcter(char []strA, char[] strB)
	{
	    int[] m1 = new int[256];
	 
	    for (int i = 0; i < strB.length; i++)
	        m1[strB[i]]++;
	 
	    for (int i = 0; i < strA.length; i++)
	        m1[strA[i]]--;
	 
	    for (int i=0;i<m1.length;i++)
	    {
	        if (m1[i]== 1)
	            return (char) i;
	    }
	    return Character.MIN_VALUE;
	}
}
