package binarySearchProblems;

public class SingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,1,2,2,3,3,4,5,5,6,6};
		int a=singleele(arr);
		System.out.println(a);
	}

	
	public static int singleele(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		if(nums[0]!=nums[1]) {
			return nums[0];
		}
		if(nums[nums.length-1]!=nums[nums.length-2]) { 
			return nums[nums.length-1];
		}
		
		int s=0;
		int e=nums.length-2;
		while(s<=e) {
			int mid = (s+e)/2;
			if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]) {
				return nums[mid];
			}
			
			if((mid%2==1 && nums[mid]==nums[mid-1])||(mid%2==0 && nums[mid]==nums[mid+1])) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
	return -1;	
	}
}
