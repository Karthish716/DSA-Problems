package stringss;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // String s = "MCMXCIV";
		String s ="IX";
     System.out.println(roman(s));
	}

	
	public static int roman(String s) {
		int res=0;
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		
		for(int i = 0;i<s.length()-1;i++) {
			if(m.get(s.charAt(i))<m.get(s.charAt(i+1))) {
				res=res-m.get(s.charAt(i));
				System.out.println(res);
			}
			else {
				res=res+m.get(s.charAt(i));
			}
		}
		return res+m.get(s.charAt(s.length()-1));
	}
}
