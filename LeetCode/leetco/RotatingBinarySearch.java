package leetco;

public class RotatingBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,1,1,1,1,1,1,1,1,2,1,1,1,1};
		int ans=rotating(arr,0);
		System.out.println(ans);
	}

	
	
	
	public static int rotating(int[] nums, int target){
		
		int peak = mountain(nums,target);
		if(peak==-1) {
			return peak;
		}
		int a = search(nums,target,0,peak);
		if(a==-1) {
			 a = search(nums,target,peak+1,nums.length-1);
		}
		
		return a;
	}

	public static int mountain(int[] nums,int target) {
		if(nums.length==1) {
			if(nums[0]==target) {
				return 0;
			}
			else {
				return -1;
			}
		}
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
	
	
public static int search(int[] arr,int target,int s , int e) {
		
		int start =s;
		int end = e;
		
		boolean asc=false;
		if(arr[start]<arr[end]) {
			asc=true;
		}
		while(start<=end) {
			int mid = (start+end)/2;
			if(asc) {
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
			}

			else {
				if(target>arr[mid]) {
					end=end-1;
				}
				else if(target<arr[mid]) {
					start = start + 1;
				}
				else {
					return mid;
				}
				
			}
		}
	 return -1;
	}
}
