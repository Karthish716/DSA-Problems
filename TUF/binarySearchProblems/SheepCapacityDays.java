package binarySearchProblems;

public class SheepCapacityDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,1,1};
		int a= sheepcap(arr,4);
		System.out.println(a);
	}

	
	public static int sheepcap(int[] nums,int days) {
		int maxi= Integer.MIN_VALUE;
		int add=0;
		  for(int i=0;i<nums.length;i++) {
	    	  maxi = Math.max(maxi, nums[i]);
	    	  add=add+nums[i];
	      }
		  int s=maxi;
		  int e=add;
		
		  while(s<=e) {
			  int mid= (s+e)/2;
			 int nod= numdays(nums,mid);
			 
			 if(nod<=days) {
				 e=mid-1;
			 }
			 else {
				 s=mid+1;
			 }
		  }
		  return s;
	}
	
	
	public static int numdays(int[] arr,int cap) {
		int days=1; int load=0;
		for(int i=0;i<arr.length;i++) {
			if(load+arr[i]>cap) {
				days=days+1;
				load = arr[i];
			}
			else {
				load=load+arr[i];
			}
		}
		return days;
	}
}
