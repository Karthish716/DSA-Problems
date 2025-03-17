package stringss;

public class IntegerAtoiString {

	
	// 8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="  ";
		System.out.println(atoi(s));

	}

	public static int atoi(String s) {
		 int i=0;
	        int sign=1;
	        long ans=0;
	        if(s.length()==0) {
	        	return 0;
	        }
	        if(s.length()==1 && s.charAt(i)==' ') {
	        	return 0;
	        }
	        if(s.length()==1 && s.charAt(i)=='0') {
	        	return 0;
	        }
	        while(i< s.length()&& s.charAt(i)==' ') {
	        	i++;
	        }
	        
	        if(i< s.length()&&s.charAt(i)=='-') {
	        	sign =-1;
	        	i++;
	        }
	        else if(i< s.length()&&s.charAt(i)=='+') {
	        	sign=1;
	        	i++;
	        }
	        
	        while(i<s.length()) {
	        	if(s.charAt(i)>='0' && s.charAt(i)<='9') {
	        		ans=ans*10+(s.charAt(i)-'0');
	        		
	        		if(ans>Integer.MAX_VALUE && sign==-1) {
	        			return Integer.MIN_VALUE;
	        		}
	        		else if(ans>Integer.MAX_VALUE && sign==1){
	        			return Integer.MAX_VALUE;
	        		}
	        		i++;
	        	}
	        	else {
	        		return (int)(ans*sign);
	        	}
	        }
	        
	        
		
		return (int)(ans*sign);
	}
}
