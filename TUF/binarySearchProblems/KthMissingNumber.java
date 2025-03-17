package binarySearchProblems;

public class KthMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,3,4,7,11};
		int a= missing(arr,5);
		System.out.println(a);
	}
	
	public static int missing(int[] nums,int k) {
		int s=0;
		int e=nums.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			int miss=nums[mid]-(mid+1);
			if(miss<k) {
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		return s+k;
	}

}
