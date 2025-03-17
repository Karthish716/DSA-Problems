package hashings;

public class StringNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="abcabcbbbbb";
  int a=repeating(s);
  System.out.println(a);
  }

	
	public static int repeating(String s) { 
	
		int count=1;
		int max=0;
		char pre=s.charAt(0);
		String d = s.substring(0, 0);
		for(int i=1;i<s.length();i++) {
			if(pre!=(s.charAt(i))) {
				count++;
				pre=s.charAt(i);
			}else {
				count=1;
			}
			if(count>max) {
				max=count;
			}
		}
	return max;	
	}
}
