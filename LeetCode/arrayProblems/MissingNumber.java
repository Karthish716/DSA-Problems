package arrayProblems;

public class MissingNumber {

	// LeetCode no.268
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[] arr= {3,0,1};
		MissingNumber m = new MissingNumber();
		int s = m.missingnum(arr);
		System.out.print(s);
	}
	
	public int missingnum(int[] arr) {
		int n = arr.length;
		int sum = (n* (n+1))/2;
		for(int i=0;i<=arr.length-1;i++) {
			sum-=arr[i];
		}
		return sum;
	}

}
