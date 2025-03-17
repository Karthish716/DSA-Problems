package stackdsa;

import java.util.Stack;

public class RemoveKDigiti {

	
   public String removekdig(String s, int k) {
	   int len = s.length();
	    if(k == 0)  return s;
	    if(k == len) return "0";
	   Stack<Character> st = new Stack<Character>();
	   
	   for(int i = 0; i<s.length();i++) {
		   while(!st.empty() && k>0 && (st.peek() - '0')>(s.charAt(i))-'0') {
			   st.pop();
			   k=k-1;
			   
		   }
		   st.push(s.charAt(i));   
		   
	   }
	   while(k>0) {
		   st.pop();
	      k--;
	   }
	      if(st.empty()) return "0";
	      
	      String res="";
	      while(!st.empty()) {
	    	  res = st.peek()+res;
	    	  st.pop();
	      }
	     
	      while(res.length()!=0 && res.charAt(0)=='0') {
	    	  res= res.substring(1);
	      }
	      
	      if(res.length()==0) {
	    	  return "0";
	      }
	      
	   return res;
   }
	
	
}




/* class Solution {
public String removeKdigits(String num, int k) {
    int len = num.length();
    if(k == 0)  return num;
    if(k == len) return "0";
    
    Stack<Character> stack = new Stack<>();
    int index = 0;
    
    while(index < len){
        while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(index)){
            stack.pop();
            k--;
        }
        stack.push(num.charAt(index++));
    }
    while(k-- > 0) stack.pop();
    
    String smallest = "";
    while(!stack.isEmpty()) smallest = stack.pop() + smallest;
    
	// delete leading zeros
    while(smallest.length() > 1 && smallest.charAt(0) == '0')
        smallest = smallest.substring(1);
    
    return smallest;
}
}

*/
