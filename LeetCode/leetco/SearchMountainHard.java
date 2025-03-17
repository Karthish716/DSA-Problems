package leetco;

public class SearchMountainHard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,3,4,5,6,4,3,2};
		int ans = mountin(arr,3);
		System.out.println(ans);
		
	}


	public static int mountin(int[]arr , int target) {
		int peak = peakmount(arr);
		int firsttry= OrderAgnostic(arr,target,0,peak);
		if(firsttry !=-1) {
			return firsttry;
		}
		
		return OrderAgnostic(arr,target,peak+1,arr.length-1);
	}
	
	public static int peakmount(int[] nums) {
		int s=0;
		int e=nums.length-1;
		
		while(s<e) {
			int mid = (s+e)/2;
			if(nums[mid]>nums[mid+1]) {
				e=mid;
			}else {
				s=mid+1;
			}
		}
		return s;
		}
	
	
	public static int OrderAgnostic(int[] arr,int target ,int start,int end) {
		
		int s=start;
		int e = end;
		boolean isAsc=arr[s]<arr[e];
		
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid]==target) {
				return mid;
			}
			
			if(isAsc) {
				if(target<arr[mid]) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}else {
				if(target>arr[mid]) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}
		}
		return -1;
	}
	
}
