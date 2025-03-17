package binarySearchProblems;

public class SearchForRotatedBinaryDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,1,2,1,1,1};
		boolean a = searchRotate(arr,3);
		System.out.println(a);
	}
	
	public static boolean searchRotate(int[] nums , int target) {
		
		int s=0;
		int e=nums.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(nums[mid]==target) {
				return true;
			}
			if(nums[s]==nums[mid] && nums[mid]==nums[e]) {
				s++;
				e--;
				continue;
			}
			if(nums[s]<=nums[mid]) {
				if(nums[s]<=target&& target <=nums[mid]) {
					e=mid-1;
				}else {
					s=mid+1;
				}
			}
			else {
				if(nums[mid]<=target && target <= nums[e]) {
					s=mid+1;
				}
				else {
					e=mid-1;
				}
			}
		}
		return false;
	}
		

}
