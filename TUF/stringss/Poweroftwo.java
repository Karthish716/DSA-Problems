package stringss;

public class Poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean s = isPowerOfTwo(18);
		System.out.print(s);
	}

	
	 public static boolean isPowerOfTwo(int n) {
	      if(n==0){
	        return false;
	      }  
	      while(n!=1){
	        if(n%2!=0){
	            return false;
	        }
	        else{
	            n=n/2;
	        }

	      }
	      return true;
	      }
}
