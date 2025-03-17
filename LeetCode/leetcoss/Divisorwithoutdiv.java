package leetcoss;

public class Divisorwithoutdiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(div(7,-3));
	}
	
	public static int div(int a, int b) {
		int count=0;
		if(b<0) {
			b= -(b);
			while(a>=b ) {
				a=a-b;
				count++;
			}
			return -(count);
		}else {
		while(a>=b ) {
			a=a-b;
			count++;
		}
		return count;
		}
		
	}

}
