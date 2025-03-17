package stringss;

import java.util.HashMap;

public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "fof";
		String t = "bab";
		System.out.println(iso(s,t));
	}

	
	public static boolean iso(String s,String t) {
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		
		for(int i=0;i<s.length();i++) {
			
			if(hm.containsKey(s.charAt(i))) 
			{
				System.out.println(i);
			 if(!hm.get(s.charAt(i)).equals(t.charAt(i))) {	
				 return false;
			 }
			}
			else
			{
			if(hm.containsValue(t.charAt(i))) {	
				return false;
			}
			hm.put(s.charAt(i), t.charAt(i));
			}
			
		}
		return true;
	}
}
