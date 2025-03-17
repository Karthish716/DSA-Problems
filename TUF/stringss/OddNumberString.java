package stringss;

public class OddNumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3504";
		String a = oddnum(s);
		System.out.print(a);
		
	}

	public static String oddnum(String s) {
		
		for(int i = s.length()-1;i>=0;i--) {
			int num = s.charAt(i)+0;
			if(num%2==1) {
				return s.substring(0, i+1);
			}
		}
		return "";
	}
}
