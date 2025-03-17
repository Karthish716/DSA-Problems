package binarySearchProblems;

public class ThersholdSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {1,2,5,9};
       int a= smallestTher(arr,7);
       System.out.println(a);
	}

	
	public static int smallestTher(int[] nums,int limit) {
		int maxi= Integer.MIN_VALUE;
		 for(int i=0;i<nums.length;i++) {
	    	  maxi = Math.max(maxi, nums[i]);
	      }
		int s=1;
		int e=maxi;
		while(s<=e) {
			int mid = (s+e)/2;
			if(sumby(nums,mid)<=limit) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
	return s;
	}
	
	
	public static int sumby(int[] arr,int div) {
		int sum=0;
	   for(int i=0;i<arr.length;i++) {
		   sum= (int) (sum + Math.ceil((double)(arr[i])/(double)(div)));
	   }
	   return sum;
	}
}
