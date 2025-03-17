package leetco;

public class RotateBinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[] arr = {1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
	int ans=rot(arr,2);
	System.out.println(ans);
	}

	
	public static int rot(int[] nums,int target) {
		
		int piv=findpivot(nums);
		System.out.println("piv ="+piv);
		if(piv==-1) {
			return search(nums,target,0,nums.length-1);
			}
		
		if(nums[piv]==target) {
			return piv;
		}
		if(target>=nums[0]) {
			return search(nums,target,0,piv);
		}
		
		return search(nums,target,piv+1,nums.length-1);
	}
	
	
	
	
	public static int findpivot(int[] arr) {
		int s=0;
		int e = arr.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(mid<e && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>s &&arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			
			if(arr[mid]<=arr[s]) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
			
		}
		return -1;
	}
	
	
public static int search(int[] arr,int target,int s ,int e) {
		
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
