package arrayProblems;

public class RotatearrainK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotatearrainK r = new RotatearrainK();
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(arr.length);
		r.rotateK(arr, 3);
		
		for(int f =0 ;f<=arr.length-1;f++) {
			System.out.print(arr[f]+" ");
		}
	}
	
	public void rotateK(int[] arr, int k) {
	    
		int n = arr.length-1;
		k=k%arr.length;
		int calc = n-k;
		reverse(0,calc,arr);
		reverse(calc+1,n,arr);
        reverse(0,n,arr);
		
	}
	
	public void reverse(int s,int e , int[] arr) {
		while(e>s) {
			 int temp = arr[s];
			 arr[s]= arr[e];
			 arr[e]=temp;
			 s++;
			 e--;
		}
	}
}
