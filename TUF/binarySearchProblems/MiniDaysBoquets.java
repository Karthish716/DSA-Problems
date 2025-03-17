package binarySearchProblems;

public class MiniDaysBoquets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {1000000000,1000000000};
		int a = bs(arr,1,1);
		System.out.println(a);
	}
	
	
	
	public static int bs(int[] nums,int m,int k) {
		long val= m* 1L * k*1L;
		if(val>nums.length) {
			return -1;
		}
		int mini= Integer.MAX_VALUE;
		int maxi= Integer.MIN_VALUE;
	      for(int i=0;i<nums.length;i++) {
	    	  mini = Math.min(mini, nums[i]);
	    	  maxi = Math.max(maxi, nums[i]);
	      }
	      int s=mini; 
	      int e = maxi;
	      while(s<=e) {
	    	  int mid = (s+e)/2;
	    	  
	    	  if(possible(nums,mid,m,k)) {
	    		  e=mid-1;
	    	  }
	    	  else {
	    		  s=mid+1;
	    	  }
	      }
	      return s;
	}

	public static boolean possible(int[] arr,int day,int m, int k) {
		int count=0; int bok=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=day) {
				count++;
			}
			else {
				bok=bok+ (count/k);
				count=0;
			}
		}
		bok=bok+count/k;
		
		return bok>=m;
	}
}
