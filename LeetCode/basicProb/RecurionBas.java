package basicProb;

public class RecurionBas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "hello";
int index= str.indexOf('t');
		System.out.println(index);
		
	}

	
	public static int fun(int x,int y) {
		if(x==0) {
			return y;
		}
		return fun(x-1,x+y);
			
	}
}
