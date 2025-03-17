package stringss;

public class ReversTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The Sky            is blue";
		String a = st(s);
		System.out.println(a);
	}
	
	public static String st(String s) {
		String[] words= s.split(" +");
		StringBuilder sb = new StringBuilder();
		
		for(int i =words.length-1;i>=0;i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
