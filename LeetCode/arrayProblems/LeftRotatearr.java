package arrayProblems;

public class LeftRotatearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeftRotatearr l = new LeftRotatearr();
		int arr[]= {2,3,5,8,9,11,23,1};
		l.leftr(arr);
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public int[] leftr(int[] arr) {
	    
		int temp = arr[0];
		for(int i = 0;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	return arr;
	}

}
