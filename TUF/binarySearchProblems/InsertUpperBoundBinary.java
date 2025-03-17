package binarySearchProblems;

public class InsertUpperBoundBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr= {1,2,3,3,5,8,8,10,10,11};
		int num=upper(arr,8);
		System.out.println(num);
	}
	
	public static int upper(int[] nums,int target) { 
		int s=0;
		int e=nums.length-1;
		int ans=nums.length;
	while(s<=e) {
		int mid=(s+e)/2;

		if(target<nums[mid]) {
			ans=mid;
			e=mid-1;
		}else {
			s=mid+1;
		}
		
	}
	return ans;
	}

}
