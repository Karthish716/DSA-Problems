package stringss;

public class MaximumParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="(()())()+()";
		System.out.println(para(s));
		
	}

	
	public static int para(String s) {
	
		int depth=0; int open=0;
		for(char c : s.toCharArray()){
			if(c=='(') {
				open++;
			}
			if(c==')') {
				open--;
			}
			
			depth=Math.max(depth, open);
		}
		return depth;
	}
}
