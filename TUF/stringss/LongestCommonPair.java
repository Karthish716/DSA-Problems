package stringss;

import java.util.Arrays;


// no. 14

public class LongestCommonPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = {"flower","flow","flight"};
		String a = longcom(s);
	   System.out.println(a);
	}

public static String longcom(String[] str) {	
	Arrays.sort(str);
	
	String str1=str[0];
	String str2=str[str.length-1];
	
	int i=0;
	while(i<str1.length()) {
		if(str1.charAt(i)==str2.charAt(i)) {
			i++;
		}
		else {
			break;
		}
	}
	return i==0 ? "":str1.substring(0,i);
}
}
