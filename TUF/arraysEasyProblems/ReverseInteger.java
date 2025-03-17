package arraysEasyProblems;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1534236469;
	
		System.out.print(rev(a));

	}
	
	public static int rev(int a) {
		int res=0;
		int temp=0;
		while(a!=0) {
			    temp=a%10;
			   
			    res = (res*10)+temp;
			    
			    a=a/10;
			   
			}
		
			return res;
		}
	
}
