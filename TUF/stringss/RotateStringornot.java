package stringss;


// 796
public class RotateStringornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcde";
		String t = "cdeab";
		System.out.println(rotate(s,t));
	}

	
	public static boolean rotate(String s,String t) {
		
		for(int i =0;i<s.length();i++) {
			
			char a = s.charAt(0);
			 s=s+a;
			s=s.substring(1);
			
			 if(s.equals(t)){
				 return true;
			 }
		}
		return false;
	}
}
