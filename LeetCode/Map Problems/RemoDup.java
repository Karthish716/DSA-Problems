package src.instasample;

import java.util.*;

//import java.util.HashSet;

public class RemoDup {

	public String remd(String s) {
		String res ="";
		Map<Character, Integer  > hm = new LinkedHashMap<Character, Integer >();
		for(int i=0;i<s.length();i++) {
			if( hm.containsKey(s.charAt(i))) {
				hm.replace(s.charAt(i), s.charAt(i)+1  );
				
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		
		for(Character c : hm.keySet()) {
	     if(hm.get(c)==1) {
	    	 res= res+ c;
	       return res;
	     }
		}
		return res;
	}

}
