package leetco;

public class NumberOfRotationsBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,6,0,2,3,4};
int ans=numbers(arr);
System.out.println(ans);	
}

public static int numbers(int[] nums) {
	int piv=findpivot(nums);
	if(piv==-1) {
		return nums[0];
	}
	return nums[piv];
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
}
