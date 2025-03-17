package leetco;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {7,7,7,7,7,8,8,9};
		int[] arr2=searchRange(arr,10);
		System.out.print(arr2[0]);
		System.out.print(arr2[1]);
	}
	
	public static int[] searchRange(int[] nums,int target) {
		int[] ans= {-1,-1};
		int start= search(nums,target,true);
		int end= search(nums,target,false);
	    
		ans[0]=start;
		ans[1]=end;
		
	return ans;
	}

	public static int search(int[] nums,int target,boolean findStartIndex) {
		int ans=-1;
		int s=0;
		int e=nums.length-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			if(target<nums[mid]) {
				e=mid-1;
			}
			else if(target>nums[mid]) {
				s=mid+1;
			}
			else {
				ans=mid;
				if(findStartIndex) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}
		}
		return ans;
	}
}
