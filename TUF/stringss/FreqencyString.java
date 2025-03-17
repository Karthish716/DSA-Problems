package stringss;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FreqencyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s = "abaabcccdet";
		System.out.println(fre(s));
	}

	
	public static String fre(String s) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(!map.containsKey(s.charAt(i))) {
				map.put(c, count);
			}
			else {
			    map.put(c,map.get(c)+1);
			}
		}
		PriorityQueue<Character> q = new PriorityQueue<>((a,b)->map.get(b)- map.get(a));
		
		for(char k : map.keySet()) {
			q.add(k);
		}
		StringBuilder sb = new StringBuilder();
	//String str="";
		while(q.size()>0) {
			char c = q.poll();
			
			for(int i =0;i<map.get(c);i++) {
				//str=str+c;
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
}
